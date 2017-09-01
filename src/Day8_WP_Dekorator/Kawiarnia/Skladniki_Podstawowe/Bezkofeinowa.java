package Day8_WP_Dekorator.Kawiarnia.Skladniki_Podstawowe;

import Day8_WP_Dekorator.Kawiarnia.Napoj;

public class Bezkofeinowa extends Napoj {
    private double cena=1.05;

    public  Bezkofeinowa( ) {
        opis="Bezkofeinowa";
    }

    @Override
    public double koszt() {
        return cena;
    }
}
