package controller;

import model.Cirkel;

public class Meetkunde {
    public static void main(String[] args) {
        Cirkel mijnEersteCirkel = new Cirkel();
        mijnEersteCirkel.straal = 3;
        mijnEersteCirkel.middelpuntX = 3;
        mijnEersteCirkel.middelpuntY = -2;
        mijnEersteCirkel.kleur = "groen";
        System.out.println(mijnEersteCirkel.geefOmtrek());
        System.out.println(mijnEersteCirkel.geefOppervlakte());
    }
}
