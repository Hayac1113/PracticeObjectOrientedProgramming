package model;

public class Team {
    private String teamNaam;
    private int totaalWedstrijdPunten;
    private int totaalVoorDoelpunten;
    private int totaalTegenDoelpunten;

    // All-args constructor
    public Team(String teamNaam, int totaalWedstrijdPunten, int totaalVoorDoelpunten, int totaalTegenDoelpunten) {
        this.teamNaam = teamNaam;
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    // Constructor with only team name
    public Team(String teamNaam) {
        this(teamNaam, 0, 0, 0);
    }

    // Default constructor
    public Team() {
        this("", 0, 0, 0);
    }

    // Getter and Setter methods
    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public int getTotaalWedstrijdPunten() {
        return totaalWedstrijdPunten;
    }

    public void setTotaalWedstrijdPunten(int totaalWedstrijdPunten) {
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
    }

    public int getTotaalVoorDoelpunten() {
        return totaalVoorDoelpunten;
    }

    public void setTotaalVoorDoelpunten(int totaalVoorDoelpunten) {
        this.totaalVoorDoelpunten = totaalVoorDoelpunten;
    }

    public int getTotaalTegenDoelpunten() {
        return totaalTegenDoelpunten;
    }

    public void setTotaalTegenDoelpunten(int totaalTegenDoelpunten) {
        this.totaalTegenDoelpunten = totaalTegenDoelpunten;
    }

    // Method to calculate goal difference
    public int getDoelSaldo() {
        return totaalVoorDoelpunten - totaalTegenDoelpunten;
    }

    // Method to display the team status
    public void printStatusTeam() {
        System.out.println("Het team " + teamNaam + " heeft " + totaalWedstrijdPunten + " wedstrijdpunt(en) en een doelsaldo van " + getDoelSaldo());
    }
}
