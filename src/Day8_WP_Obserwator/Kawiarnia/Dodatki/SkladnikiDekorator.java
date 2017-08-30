package Day8_WP_Obserwator.Kawiarnia.Dodatki;

import Day8_WP_Obserwator.Kawiarnia.Napoj;

public abstract class SkladnikiDekorator extends Napoj {


    @Override
    public abstract double koszt();

    @Override
    public abstract String pobierzOpis();
}
