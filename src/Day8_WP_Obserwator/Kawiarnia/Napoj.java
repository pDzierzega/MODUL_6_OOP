package Day8_WP_Obserwator.Kawiarnia;

public abstract class Napoj {
    protected String opis;

    public abstract double koszt();

    public String pobierzOpis(){
        return opis;
    }

    @Override
    public String toString() {
        return String.format("Nazwa %s, :: Koszt %.2f, ",pobierzOpis(), koszt());
    }
}
