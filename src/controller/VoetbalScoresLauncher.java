package controller;

import model.Team;
import model.Wedstrijd2;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        // Creating teams
        Team vvv = new Team("VVV");
        Team nac = new Team("NAC");
        Team pec = new Team("PEC");

        // Creating an array of matches with predefined scores for testing
        Wedstrijd2[] wedstrijden = {
                new Wedstrijd2(vvv, nac, 3, 0),
                new Wedstrijd2(vvv, pec, 1, 1),
                new Wedstrijd2(nac, pec, 2, 1),
                new Wedstrijd2(nac, vvv, 0, 0),
                new Wedstrijd2(pec, vvv, 2, 0),
                new Wedstrijd2(pec, nac, 1, 2)
        };

        // Displaying match results and updating teams
        for (Wedstrijd2 wedstrijd : wedstrijden) {
            wedstrijd.printUitslag();
            wedstrijd.updateTeams();
        }

        // Displaying team status
        vvv.printStatusTeam();
        nac.printStatusTeam();
        pec.printStatusTeam();
    }
}
