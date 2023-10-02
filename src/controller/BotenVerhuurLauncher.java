package controller;

import model.*;

import java.time.LocalDate;

public class BotenVerhuurLauncher {
    public static void main(String[] args) {
        System.out.println("Welkom! [Jouw naam] [Jouw studentnummer]");

        // Test cases
        Boot boot1 = new MotorBoot("De Engel", 9, 15);
        Boot boot2 = new ZeilBoot("Valk 1", 17);
        Boot boot3 = new MotorBoot("SuzyQ", 18, 22);
        Boot bootFout = new MotorBoot("Foute Boot", -1, 15);  // Boot met negatieve lengte

        System.out.println(bootFout);  // Print informatie over de boot met negatieve lengte

        Klant klant1 = new Klant("Jan de Boer", "jandb@email.com", false);
        Verhuur verhuur1 = new Verhuur(klant1, LocalDate.of(2020, 12, 3), 5);
        verhuur1.voegBootToe(boot1);
        verhuur1.voegBootToe(boot2);
        verhuur1.voegBootToe(boot3);
        verhuur1.voegBootToe(bootFout);  // Probeer boot met negatieve lengte toe te voegen
        System.out.println(verhuur1);

        Klant klant2 = new Klant("Van der Valk", "vdv@email.com", true);
        Verhuur verhuur2 = new Verhuur(klant2, LocalDate.of(2020, 12, 3), 5);
        verhuur2.voegBootToe(boot1);
        verhuur2.voegBootToe(boot2);
        verhuur2.voegBootToe(boot3);
        System.out.println(verhuur2);
    }
}
