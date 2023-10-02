package controller;

import model.Persoon;

public class BedrijfLauncher {
    public static void main(String[] args) {
        System.out.println(Persoon.aantalPersonen);
        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        /*
        * Verbeter de fouten, die inmiddels in de code in je main methode zijn ontstaan (benader de
        attributen via hun getters).*/
        Persoon assistent = new Persoon ("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);
        System.out.printf("%S verdient %.2f per jaar\n", baas.getNaam(), baas.berekenJaarInkomen());
        System.out.printf("%S verdient %.2f per jaar\n", medewerker.getNaam(), medewerker.berekenJaarInkomen());
        System.out.printf("%s woont in %s\n", assistent.getNaam(), assistent.getWoonplaats());

        //If methode om te kijken of iemand recht heeft op bonus
        if (baas.heeftRechtOpBonus()) {
            System.out.printf("%s heeft recht op bonus\n", baas.getNaam());
        } else {
            System.out.printf("%s heeft geen recht op bonus\n", baas.getNaam());
        }

        if (medewerker.heeftRechtOpBonus()) {
            System.out.printf("%s heeft recht op bonus\n", medewerker.getNaam());
        } else {
            System.out.printf("%s heeft geen recht op bonus\n", medewerker.getNaam());
        }

        if (assistent.heeftRechtOpBonus()) {
            System.out.printf("%s heeft recht op bonus\n", assistent.getNaam());
        } else {
            System.out.printf("%s heeft geen recht op bonus\n", assistent.getNaam());
        }
    }
}
