package Day6_WP_Strategia.SymulatorKaczki;

import Day6_WP_Strategia.SymulatorKaczki.I_Latanie.LatamBoMamSkrzydla;
import Day6_WP_Strategia.SymulatorKaczki.I_Kwacz.Kwacz;

public class PlaskonosaKaczka extends Kaczka {

    public PlaskonosaKaczka() {
        kwakanie=new Kwacz();
        latanie=new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem plaskonosa kaczka");
    }
}
