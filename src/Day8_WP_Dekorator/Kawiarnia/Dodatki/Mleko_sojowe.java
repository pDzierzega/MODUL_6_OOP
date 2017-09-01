package Day8_WP_Dekorator.Kawiarnia.Dodatki;

import Day8_WP_Dekorator.Kawiarnia.Napoj;
import Day8_WP_Dekorator.Kawiarnia.SkladnikiDekorator;

public class Mleko_sojowe extends SkladnikiDekorator {
    private Napoj napoj;
    private double cena=0.15;

    public Mleko_sojowe(Napoj napoj) {
      this.napoj=napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt()+cena;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis()+" + mleko sojowe";
    }
}
