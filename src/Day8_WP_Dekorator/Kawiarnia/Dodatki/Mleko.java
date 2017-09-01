package Day8_WP_Dekorator.Kawiarnia.Dodatki;

import Day8_WP_Dekorator.Kawiarnia.Napoj;
import Day8_WP_Dekorator.Kawiarnia.SkladnikiDekorator;

public class Mleko extends SkladnikiDekorator {
    private Napoj napoj;
    private double cena=0.10;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt()+cena;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis()+" + mleko";
    }
}
