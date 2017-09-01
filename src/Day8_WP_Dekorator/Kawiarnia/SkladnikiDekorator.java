package Day8_WP_Dekorator.Kawiarnia;

public abstract class SkladnikiDekorator extends Napoj {


    @Override
    public abstract double koszt();

    @Override
    public abstract String pobierzOpis();
}
