package Day6_WP_Strategia.SymulatorKaczki;

import Day6_WP_Strategia.SymulatorKaczki.I_Latanie.NieLatam;
import Day6_WP_Strategia.SymulatorKaczki.I_Kwacz.NieKwacz;

public class WabikKaczka extends Kaczka {

    public WabikKaczka() {
        latanie=new NieLatam();
        kwakanie=new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem drewniana kaczka wabik, ale wygladam jak prawdziwa");
    }
}
