package model;

public class Persoon {
    public static int aantalPersonen;
    public final int personeelsNummer;
    public String naam;
    public String woonplaats;
    public double maandSalaris;
    public final double GRENSWAARDE_BONUS = 4500.00;

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
}
