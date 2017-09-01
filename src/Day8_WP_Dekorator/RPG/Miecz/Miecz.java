package Day8_WP_Dekorator.RPG.Miecz;

public abstract class Miecz {
    protected String nazwa;
    protected double atak;

    public Miecz(String nazwa, double atak){
        this.nazwa=nazwa;
        this.atak=atak;
    }

    public double getAtak(){
        return atak;
    }

    @Override
    public String toString() {
        return "";
    }
}
