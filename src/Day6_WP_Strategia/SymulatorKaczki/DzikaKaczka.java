package Day6_WP_Strategia.SymulatorKaczki;

import Day6_WP_Strategia.SymulatorKaczki.I_Latanie.LatamBoMamSkrzydla;
import Day6_WP_Strategia.SymulatorKaczki.I_Kwacz.Kwacz;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanie=new Kwacz();
        latanie=new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem dzika kaczka");
    }
}
