package Day8_WP_Obserwator.Kawiarnia.Dodatki;

import Day8_WP_Obserwator.Kawiarnia.Napoj;

public class Mleko extends SkladnikiDekorator{
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
