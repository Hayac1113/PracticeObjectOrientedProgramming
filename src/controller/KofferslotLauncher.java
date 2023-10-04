package controller;

import model.Kofferslot;

public class KofferslotLauncher {
    public static void main(String[] args) {
        // Test of de default constructor van de klasse Kofferslot werkt.
        Kofferslot slot1 = new Kofferslot();
        System.out.println("Default constructor: " + slot1); // Verwacht: AA0

        // Test of de all-args constructor van de klasse Kofferslot werkt.
        Kofferslot slot2 = new Kofferslot('B', 'R', 9);
        System.out.println("All-args constructor: " + slot2); // Verwacht: BR9

        // Test of de methode volgende() van de klasse Kofferslot correct werkt.
        // AA0 volgende moet zijn: AA1
        Kofferslot slot3 = new Kofferslot('A', 'A', 0);
        slot3.volgende();
        System.out.println("Van AA0 naar: " + slot3); // Verwacht: AA1

        // BR9 volgende moet zijn: BS0
        Kofferslot slot4 = new Kofferslot('B', 'R', 9);
        slot4.volgende();
        System.out.println("Van BR9 naar: " + slot4); // Verwacht: BS0

        // DZ9 volgende moet zijn: EA0
        Kofferslot slot5 = new Kofferslot('D', 'Z', 9);
        slot5.volgende();
        System.out.println("Van DZ9 naar: " + slot5); // Verwacht: EA0

        // ZZ9 volgende moet zijn: AA0
        Kofferslot slot6 = new Kofferslot('Z', 'Z', 9);
        slot6.volgende();
        System.out.println("Van ZZ9 naar: " + slot6); // Verwacht: AA0
    }
}