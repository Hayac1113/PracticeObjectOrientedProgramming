package model;

public class ParkeerActie {
    public String kenteken;
    public int tijdsduur;
    public static final double TARIEF = 2.75;

    public ParkeerActie(String kenteken, int tijdsduur) {
        this.kenteken = kenteken;
        this.tijdsduur = tijdsduur;
    }

    public double berekenenKosten() {
        return tijdsduur * TARIEF;
    }

    public static void printKostenInformatie() {
        System.out.println("Het tarief per uur is: " + TARIEF);
    }
}
