package Day8_WP_Dekorator.Kawiarnia.Skladniki_Podstawowe;

import Day8_WP_Dekorator.Kawiarnia.Napoj;

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
