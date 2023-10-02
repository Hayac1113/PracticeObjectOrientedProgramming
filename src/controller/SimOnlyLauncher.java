/*@author Haoming Yang
* Dit programma gaat een nieuw SimOnly abonnement afsluiten en op basis van je dataverbruik van de
afgelopen maanden bekijkt het of een bepaald abonnement voor de gebruiker een geschikte keuze is. Dit
abonnement heeft de volgende kenmerken:
• Prijs van het abonnement (per maand): € 9,95
• Data inbegrepen bij het abonnement: 3000 MB
• Meerprijs per verbruikte MB buiten de bundel: € 0,025*/

package controller;

import model.Verbruik;

public class SimOnlyLauncher {
    public static void main(String[] args) {
        //Maak een array van vier objecten van het type Verbruik aan.
        Verbruik[] verbruik = new Verbruik[4];
        //Gebruik de constructor Verbruik(String maand) om de objecten van de array klaar te zetten.
        verbruik[0] = new Verbruik("Juli");
        verbruik[1] = new Verbruik("Augustus");
        verbruik[2] = new Verbruik("September");
        verbruik[3] = new Verbruik("Oktober");
        //Vraag de gebruiker in een for-loop voor elke maand om de verbruikte hoeveelheid data.
        //Gebruik de getter voor maand om de maand te tonen, gebruik de setter voor
        //hoeveelheidMb om de waardes mee te geven aan het object.
        for (int i = 0; i < verbruik.length; i++) {
            System.out.println("Voer de verbruikte hoeveelheid data in voor " + verbruik[i].getMaand() + ":");
            verbruik[i].setHoeveelheidMb(3000);
        }
        //Gebruik een for-loop om voor alle vier de maanden de kosten te bereken.
        for (int i = 0; i < verbruik.length; i++) {
            verbruik[i].berekenKosten();
        }
        //Gebruik een for-loop om voor alle vier de maanden de informatie te tonen.
        for (int i = 0; i < verbruik.length; i++) {
            verbruik[i].toonVerbruik();
        }
        //Maak een methode toonVerbruik() die op basis van de waarde van de attributen de
        //informatie van het verbruik afdrukt:
        //Augustus 4563 49,03 buiten je bundel!
        //Oktober 2134 9,95
        toonVerbruik("Augustus", 4563);
        toonVerbruik("Oktober", 2134);


    }

    //Maak een methode toonVerbruik() die op basis van de waarde van de attributen de
    //informatie van het verbruik afdrukt:
    //Augustus 4563 49,03 buiten je bundel!
    //Oktober 2134 9,95
    public static void toonVerbruik(String maand, int hoeveelheidMb) {
        if (hoeveelheidMb > 3000) {
            System.out.println(maand + " " + hoeveelheidMb + " " + (9.95 + (hoeveelheidMb - 3000) * 0.025) + " buiten je bundel!");
        } else {
            System.out.println(maand + " " + hoeveelheidMb + " " + 9.95);
        }
    }
}
