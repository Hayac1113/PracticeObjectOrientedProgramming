package controller;

import model.Wedstrijd;

import java.util.Scanner;

public class VoetballScoresLauncher {
    public static void main(String[] args) {
        Wedstrijd eersteWedstrijd = new Wedstrijd ("PEC", 5, 0);
        eersteWedstrijd.printUitslag();
        eersteWedstrijd.printWedstrijdPunten();
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Wie is de tegenstander? ");
        String naamTegenstander = input.next();
        Wedstrijd tweedeWedstrijd = new Wedstrijd(naamTegenstander);
        System.out.print("Doelpunten gescoord: ");
        tweedeWedstrijd.voorDoelpunten = input.nextInt();
        System.out.print("Doelpunten tegenstander: ");
        tweedeWedstrijd.tegenDoelpunten = input.nextInt();
        tweedeWedstrijd.printUitslag();
        tweedeWedstrijd.printWedstrijdPunten();

    }
}
