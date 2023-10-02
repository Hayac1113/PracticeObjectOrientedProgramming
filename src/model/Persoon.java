package model;

public class Persoon {
    public static int aantalPersonen;
    private final int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private static final double GRENSWAARDE_BONUS = 4500.00;

    public Persoon(String naam, String woonplaats, double maandSalaris) {
        this.personeelsNummer = ++aantalPersonen;
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;
    }

    public Persoon(String naam) {
        this.naam = naam;
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon() {
        this.naam = naam;
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public double berekenJaarInkomen() {
        return 12 * maandSalaris;
    }

    public boolean heeftRechtOpBonus() {
        return maandSalaris > GRENSWAARDE_BONUS;
    }

    /*
    * a) Voeg de constante GRENSWAARDE_BONUS toe.
    b) Maak de vier niet-statische attributen private.
    c) Voeg getters en setters toe voor deze vier attributen (de getters en setters zijn niet
    opgenomen in het klassendiagram). Let wel: voor het attribuut personeelsNummer mag je
    geen setter opnemen. Dit attribuut is final en kun je dus niet meer aanpassen.
    d) Pas de methode setMaandSalaris() aan, zodat deze een foutmelding geeft als het
    meegegeven bedrag negatief is. Het maandsalaris wordt dan op 0 gezet.
    e) Pas constructor chaining toe op de drie constructors.
    f) Zorg dat ook in de constructors geen negatief maandsalaris geaccepteerd wordt.
    g) Voeg de methode heeftRechtOpBonus() toe. Deze geeft true als het maandsalaris
    groter is dan of gelijk is aan de GRENSWAARDE_BONUS.*/
public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < 0) {
            System.out.println("Het maandsalaris mag niet negatief zijn. Het wordt op 0 gezet.");
            this.maandSalaris = 0.0;
        } else {
            this.maandSalaris = maandSalaris;
        }
    }

    public static double getGrensWaardeBonus() {
        return GRENSWAARDE_BONUS;
    }

    public boolean equals(Persoon persoon) {
        return this.personeelsNummer == persoon.personeelsNummer;
    }

    public String toString() {
        return String.format("%s (%d)", naam, personeelsNummer);
    }


}
