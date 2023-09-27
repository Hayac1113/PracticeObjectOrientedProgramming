package model;

public class Wedstrijd {
    public String naamTegenstander;
    public int voorDoelpunten;
    public int tegenDoelpunten;

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public Wedstrijd(String naamTegenstander) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public Wedstrijd() {
        this.naamTegenstander = "Onbekend";
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public int bepaalWedstrijdpunten() {
        if (voorDoelpunten > tegenDoelpunten) {
            return 3;
        } else if (voorDoelpunten == tegenDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    public void printUitslag() {
        System.out.println("Uitslag van de wedstrijd tegen " + naamTegenstander + ": " + voorDoelpunten + "-" + tegenDoelpunten);
    }

    public void printWedstrijdPunten() {
        if (bepaalWedstrijdpunten() == 1) {
            System.out.println("Dit levert 1 wedstrijdpunt op");
        } else {
            System.out.printf("Dit levert %d wedstrijdpunten op\n", bepaalWedstrijdpunten());
        }
    }

}
