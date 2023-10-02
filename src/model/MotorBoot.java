package model;

public class MotorBoot extends Boot {
    private double snelheid;

    public MotorBoot(String naam, double lengte, double snelheid) {
        super(naam, lengte);
        this.snelheid = snelheid;
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        return (lengte > 15 || snelheid > 20);
    }

    @Override
    public double berekenHuurprijs() {
        return (lengte < 10) ? 60 : 90;
    }

    @Override
    public String toString() {
        return "MotorBoot " + super.toString() + "\nVaarbewijs vereist: " + (isVaarbewijsPlichtig() ? "Ja" : "Nee") + "\nHuurprijs: " + String.format("%.2f", berekenHuurprijs()) + " euro";
    }
}

