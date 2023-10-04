package model;

public class Kofferslot {

    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot() {
        this('A', 'A', 0);
    }

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        setCombinatie(eersteLetter, tweedeLetter, cijfer);
    }

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
        this.eersteLetter = eersteLetter;
        this.tweedeLetter = tweedeLetter;
        this.cijfer = cijfer;
    }

    public char volgendeLetter(char letter) {
        return (letter == 'Z') ? 'A' : (char)(letter + 1);
    }

    public int volgendeCijfer(int cijfer) {
        return (cijfer == 9) ? 0 : cijfer + 1;
    }

    public void volgende() {
        cijfer = volgendeCijfer(cijfer);
        if (cijfer == 0) {
            tweedeLetter = volgendeLetter(tweedeLetter);
            if (tweedeLetter == 'A') {
                eersteLetter = volgendeLetter(eersteLetter);
            }
        }
    }

    @Override
    public String toString() {
        return "" + eersteLetter + tweedeLetter + cijfer;
    }
}