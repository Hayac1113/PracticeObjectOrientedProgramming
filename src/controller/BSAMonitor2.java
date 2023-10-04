package controller;
import model.Score;
import model.Vak;

import java.util.Scanner;

public class BSAMonitor2 {

    public static void main(String[] args) {
        Vak[] vakken = {
                new Vak("Fasten Your Seatbelts", 12, 5.5),
                new Vak("Programming", 3, 5.5),
                new Vak("Databases", 3, 5.5),
                new Vak("Personal Skills", 2, 5.5),
                new Vak("Project Skills", 2, 5.5),
                new Vak("OOP", 3, 5.5),
                new Vak("User Interaction", 3, 5.5)
        };

        Score[] scores = new Score[vakken.length];

        Scanner scanner = new Scanner(System.in);
        int totaalBehaaldePunten = 0;

        for (int i = 0; i < vakken.length; i++) {
            System.out.print(vakken[i].getNaam() + ": ");
            double cijfer = scanner.nextDouble();
            scores[i] = new Score(vakken[i], cijfer);
            totaalBehaaldePunten += scores[i].getBehaaldePunten();
        }

        System.out.println("Vak/project\t\t\tCijfer\tBehaalde punten");
        for (Score score : scores) {
            System.out.printf("%-25s\t%.1f\t%d\n", score.getVak().getNaam(), score.getCijfer(), score.getBehaaldePunten());
        }

        int totaalMogelijkePunten = 0;
        for (Vak vak : vakken) {
            totaalMogelijkePunten += vak.getPunten();
        }

        System.out.printf("Totaal behaalde studiepunten: %d/%d\n", totaalBehaaldePunten, totaalMogelijkePunten);

        if (totaalBehaaldePunten < (5.0/6.0) * totaalMogelijkePunten) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }
    }
}

