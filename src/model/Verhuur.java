package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Verhuur {
    private Klant klant;
    private LocalDate startDatum;
    private int dagen;
    private List<Boot> boten;

    public Verhuur(Klant klant, LocalDate startDatum, int dagen) {
        this.klant = klant;
        this.startDatum = startDatum;
        this.dagen = dagen;
        this.boten = new ArrayList<>();
    }

    public boolean magVerhuurd(Boot boot) {
        return !(boot.isVaarbewijsPlichtig() && !klant.isVaarVaardig());
    }

    public void voegBootToe(Boot boot) {
        if (magVerhuurd(boot)) {
            boten.add(boot);
        } else {
            System.out.println(boot + "\nMag niet verhuurd worden! Toevoegen mislukt.");
        }
    }

    public double berekenHuurBedrag() {
        double totaal = 0.0;
        for (Boot boot : boten) {
            totaal += boot.berekenHuurprijs() * dagen;
        }
        return totaal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (boten.isEmpty()) {
            sb.append("De verhuur aan ").append(klant).append(" op ").append(startDatum).append(" is mislukt, geen boten toegevoegd.");
        } else {
            sb.append("De verhuur aan ").append(klant).append(" van ").append(startDatum).append(" tot ").append(startDatum.plusDays(dagen - 1)).append(" kost ").append(String.format("%.2f", berekenHuurBedrag())).append(" euro:\n");
            Collections.sort(boten);
            for (Boot boot : boten) {
                sb.append(boot).append("\n");
            }
        }
        return sb.toString();
    }
}
