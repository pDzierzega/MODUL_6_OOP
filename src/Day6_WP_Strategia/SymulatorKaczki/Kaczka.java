package Day6_WP_Strategia.SymulatorKaczki;

import Day6_WP_Strategia.SymulatorKaczki.I_Latanie.I_Latanie;
import Day6_WP_Strategia.SymulatorKaczki.I_Kwacz.I_Kwakanie;

public abstract class Kaczka {
    protected I_Latanie latanie;
    protected I_Kwakanie kwakanie;

    public void setLatanie(I_Latanie latanie) {
        this.latanie = latanie;
    }

    public void setKwakanie(I_Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public void wykonajLatanie(){
        latanie.lec();
    }

    public void wykonajKwakanie(){
        kwakanie.kwacz();
    }

    public void plywaj(){
        System.out.println("Plywam");
    }

    public void wyswietl(){
        System.out.println("Jestem kaczka");
    }
}
