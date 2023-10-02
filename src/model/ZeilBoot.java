package model;

public class ZeilBoot extends Boot {

    /*
    1. Voor zeilboten langer dan 15 meter is een vaarbewijs noodzakelijk.
    2. Zeilboten kosten 40 euro per dag als ze korter zijn dan 7 meter en anders kosten ze 70 euro.
    */

    private final static int MIN_LENGTE = 7;
    private final static int MAX_LENGTE = 15;
    private final static double PRIJS_KORTER_DAN_7_METER = 40;
    private final static double PRIJS_LANGER_DAN_7_METER = 70;


    public ZeilBoot(String naam, int lengte) {
        super(naam, lengte);
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        return (lengte > 15);
    }

    @Override
    public double berekenHuurprijs() {
        return (lengte < 7) ? 40 : 70;
    }

    @Override
    public String toString() {
        return "ZeilBoot " + super.toString() + "\nVaarbewijs vereist: " + (isVaarbewijsPlichtig() ? "Ja" : "Nee") + "\nHuurprijs: " + String.format("%.2f", berekenHuurprijs()) + " euro";
    }
}


