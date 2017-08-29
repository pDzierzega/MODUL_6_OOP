package Day6_WP_Strategia.SymulatorKaczki;

import Day6_WP_Strategia.SymulatorKaczki.I_Latanie.NieLatam;
import Day6_WP_Strategia.SymulatorKaczki.I_Kwacz.Piszcz;

public class GumowaKaczka extends Kaczka{

    public GumowaKaczka() {
        latanie=new NieLatam();
        kwakanie=new Piszcz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem zolto gumowa kaczka");
    }
}
