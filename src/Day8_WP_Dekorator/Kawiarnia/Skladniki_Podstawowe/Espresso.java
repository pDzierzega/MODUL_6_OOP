package Day8_WP_Dekorator.Kawiarnia.Skladniki_Podstawowe;

import Day8_WP_Dekorator.Kawiarnia.Napoj;

public class Espresso extends Napoj {
    private double cena=1.99;

    public  Espresso ( ) {
        opis="Espresso";
    }

    @Override
    public double koszt() {
        return cena;
    }
}
