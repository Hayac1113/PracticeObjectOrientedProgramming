/*Deze methode bevat:
* Maak een constructor Verbruik(String maand, int hoeveelheidMb) die de
meegegeven maand en de hoeveelheid gebruikte data kopieert in de bijbehorende
attributen. Een all-args constructor is hier niet nodig, omdat de kosten berekend zullen
worden.
b. Maak een constructor Verbruik(String maand) die de meegegeven maand kopieert in
het bijbehorende attribuut en de hoeveelheidMb op 0 zet.
c. Maak een default constructor Verbruik(), die de maand op ‘Onbekend’ zet en de
hoeveelheidMb op 0.
d. Maak een methode berekenKosten() die op basis van hoeveelheid gebruikte data de
waarde van het attribuut kosten berekent. Deze kosten bestaan uit de abonnementsprijs
plus de kosten van dataverbruik buiten de bundel. Zie de inleiding voor de berekening.
Maak gebruik van constanten.
2 / 2
e. Maak een methode toonVerbruik() die op basis van de waarde van de attributen de
informatie van het verbruik afdrukt:
Augustus 4563 49,03 buiten je bundel!
Oktober 2134 9,95
3. Test de werking van de klasse Verbruik in de main methode van de klasse
SimOnlyLauncher.
a. Maak een object aan van de klasse Verbruik door de constructor aan te roepen:
Verbruik augustusVerbruik = new Verbruik(“Augustus”, 4563);
b. Roep de berekenKosten() en de toonVerbruik() methodes aan op dit object.
4. Test de werking ook door een array van Verbruik objecten aan te maken voor de maanden Juli,
Augustus, September en Oktober.
a. Gebruik de constructor Verbruik(String maand) om de objecten van de array klaar te
zetten.
b. Vraag de gebruiker in een for-loop voor elke maand om de verbruikte hoeveelheid data.
Gebruik de getter voor maand om de maand te tonen, gebruik de setter voor
hoeveelheidMb om de waardes mee te geven aan het object.
c. Gebruik een for-loop om voor alle vier de maanden de kosten te bereken.
d. Gebruik een for-loop om voor alle vier de maanden de informatie te tonen.*/

package model;

public class Verbruik {
    private String maand;
    private int hoeveelheidMb;
    private double kosten;
    private final double ABONNEMENTSPRIJS = 9.95;
    private final double KOSTEN_BUITEN_BUNDEL = 0.025;

    public Verbruik(String maand, int hoeveelheidMb) {
    this.maand = maand;
    this.hoeveelheidMb = hoeveelheidMb;
    }

    public Verbruik(String maand) {
        this.maand = maand;
        this.hoeveelheidMb = 0;
    }

    public Verbruik() {
        this.maand = "Onbekend";
        this.hoeveelheidMb = 0;
    }

    public void berekenKosten() {
        kosten = ABONNEMENTSPRIJS + (hoeveelheidMb * KOSTEN_BUITEN_BUNDEL);
    }

    public void toonVerbruik() {
        if (hoeveelheidMb > 3000) {
            System.out.println(maand + " " + hoeveelheidMb + " " + kosten + " buiten je bundel!");
        } else {
            System.out.println(maand + " " + hoeveelheidMb + " " + kosten);
        }
    }

    public String getMaand() {
        return maand;
    }

    public void setMaand(String maand) {
        this.maand = maand;
    }

    public int getHoeveelheidMb() {
        return hoeveelheidMb;
    }

    public void setHoeveelheidMb(int hoeveelheidMb) {
        this.hoeveelheidMb = hoeveelheidMb;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }

    public double getABONNEMENTSPRIJS() {
        return ABONNEMENTSPRIJS;
    }

    public double getKOSTEN_BUITEN_BUNDEL() {
        return KOSTEN_BUITEN_BUNDEL;
    }

    public double getAbonnementsprijs() {
        return ABONNEMENTSPRIJS;
    }

    public int getKostenBuitenBundel() {
        return (int) KOSTEN_BUITEN_BUNDEL;
    }
}
