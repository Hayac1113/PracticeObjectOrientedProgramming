package model;

public class Wedstrijd2 {
    private Team thuisTeam;
    private Team uitTeam;
    private int thuisDoelpunten;
    private int uitDoelpunten;

    // All-args constructor
    public Wedstrijd2(Team thuisTeam, Team uitTeam, int thuisDoelpunten, int uitDoelpunten) {
        this.thuisTeam = thuisTeam;
        this.uitTeam = uitTeam;
        this.thuisDoelpunten = thuisDoelpunten;
        this.uitDoelpunten = uitDoelpunten;
    }

    // Getter and Setter methods
    public Team getThuisTeam() {
        return thuisTeam;
    }

    public void setThuisTeam(Team thuisTeam) {
        this.thuisTeam = thuisTeam;
    }

    public Team getUitTeam() {
        return uitTeam;
    }

    public void setUitTeam(Team uitTeam) {
        this.uitTeam = uitTeam;
    }

    public int getThuisDoelpunten() {
        return thuisDoelpunten;
    }

    public void setThuisDoelpunten(int thuisDoelpunten) {
        this.thuisDoelpunten = thuisDoelpunten;
    }

    public int getUitDoelpunten() {
        return uitDoelpunten;
    }

    public void setUitDoelpunten(int uitDoelpunten) {
        this.uitDoelpunten = uitDoelpunten;
    }

    // Method to print the match result
    public void printUitslag() {
        System.out.println("Uitslag van de wedstrijd " + thuisTeam.getTeamNaam() + "-" + uitTeam.getTeamNaam() + ": " + thuisDoelpunten + "-" + uitDoelpunten);
    }

    // Method to calculate match points for home team
    public int getWedstrijdPuntenThuisTeam() {
        if (thuisDoelpunten > uitDoelpunten) {
            return 3;
        } else if (thuisDoelpunten == uitDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    // Method to calculate match points for away team
    public int getWedstrijdPuntenUitTeam() {
        if (uitDoelpunten > thuisDoelpunten) {
            return 3;
        } else if (uitDoelpunten == thuisDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    // Method to update team points and goals
    public void updateTeams() {
        thuisTeam.setTotaalWedstrijdPunten(thuisTeam.getTotaalWedstrijdPunten() + getWedstrijdPuntenThuisTeam());
        thuisTeam.setTotaalVoorDoelpunten(thuisTeam.getTotaalVoorDoelpunten() + thuisDoelpunten);
        thuisTeam.setTotaalTegenDoelpunten(thuisTeam.getTotaalTegenDoelpunten() + uitDoelpunten);

        uitTeam.setTotaalWedstrijdPunten(uitTeam.getTotaalWedstrijdPunten() + getWedstrijdPuntenUitTeam());
        uitTeam.setTotaalVoorDoelpunten(uitTeam.getTotaalVoorDoelpunten() + uitDoelpunten);
        uitTeam.setTotaalTegenDoelpunten(uitTeam.getTotaalTegenDoelpunten() + thuisDoelpunten);
    }
}
