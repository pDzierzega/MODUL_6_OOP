package Day8_WP_Obserwator.Kawiarnia.Skladniki_Podstawowe;

import Day8_WP_Obserwator.Kawiarnia.Napoj;

public class StarCafeSpecial extends Napoj {
    private double cena=0.89;

    public StarCafeSpecial() {
        opis="StarCafeSpecial";
    }

    @Override
    public double koszt() {
        return cena;
    }

}
