package Day8_WP_Obserwator.Kawiarnia.Dodatki;

import Day8_WP_Obserwator.Kawiarnia.Napoj;

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
