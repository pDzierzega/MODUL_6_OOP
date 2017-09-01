package Day8_WP_Dekorator.Kawiarnia.Dodatki;

import Day8_WP_Dekorator.Kawiarnia.Napoj;
import Day8_WP_Dekorator.Kawiarnia.SkladnikiDekorator;

public class Czekolada extends SkladnikiDekorator {
    private Napoj napoj;
    private double cena=0.20;

    public Czekolada(Napoj napoj) {
      this.napoj=napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt()+cena;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis()+" + czekolada";
    }
}
