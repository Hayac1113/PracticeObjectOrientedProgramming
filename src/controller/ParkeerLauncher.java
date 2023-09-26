package controller;

import model.ParkeerActie;

import java.util.Scanner;

public class ParkeerLauncher {
    public static void main(String[] args) {

        //Vraag input data
        Scanner input = new Scanner(System.in);

        // ParkeerActie declaren en mbv constructor initialiseren. De contructor is nu een concreet object van het type ParkeerActie.
        ParkeerActie actie = new ParkeerActie("kenteken", 12);
        ParkeerActie actie2 = new ParkeerActie("kenteken2", 21);
        System.out.println(actie2.kenteken);
        //Aanroepen van de methode printKostenInformatie() op het object actie.
        ParkeerActie.printKostenInformatie();
        //Aanroepen van de methode printKostenInformatie() en gebruik eigenschappen van het object actie.
        System.out.printf("Auto met kentekenen %s heeft %d uur geparkeerd en kost %.2f euro%n", actie.kenteken, actie.tijdsduur, actie.berekenenKosten());
        System.out.printf("Auto met kentekenen %s heeft %d uur geparkeerd en kost %.2f euro%n", actie2.kenteken, actie2.tijdsduur, actie2.berekenenKosten());
    }
}
