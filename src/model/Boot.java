package model;

public abstract class Boot implements VrijVerhuurbaar, Comparable<Boot> {
    private static int lastId = 0;
    private final int id;
    protected String naam;
    protected double lengte;

    public Boot(String naam, double lengte) {
        this.id = ++lastId;
        this.naam = naam;
        this.lengte = (lengte <= 0) ? 5.0 : lengte;
    }

    @Override
    public int compareTo(Boot o) {
        return this.naam.compareTo(o.naam);
    }

    @Override
    public String toString() {
        return "Boot " + id + " met naam " + naam;
    }

    public abstract double berekenHuurprijs();
}
