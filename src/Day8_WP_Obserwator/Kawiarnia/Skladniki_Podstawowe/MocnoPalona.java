package Day8_WP_Obserwator.Kawiarnia.Skladniki_Podstawowe;

import Day8_WP_Obserwator.Kawiarnia.Napoj;

public class MocnoPalona extends Napoj {
    private double cena=0.99;

    public MocnoPalona() {
        opis="MocnoPalona";
    }

    @Override
    public double koszt() {
        return 9.99;
    }

}
