package Day6_WP_Strategia;

import Day6_WP_Strategia.SymulatorKaczki.*;
import Day6_WP_Strategia.SymulatorKaczki.I_Kwacz.Piszcz;
import Day6_WP_Strategia.SymulatorKaczki.I_Latanie.LotZNapedemRakietowym;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kaczka> lista=new ArrayList<>();

        Kaczka kaczka=new KaczkaModel();
        DzikaKaczka dzika=new DzikaKaczka();
        PlaskonosaKaczka plaskonosa=new PlaskonosaKaczka();
        GumowaKaczka gumowa=new GumowaKaczka();
        WabikKaczka wabik=new WabikKaczka();

        lista.add(kaczka);
        lista.add(dzika);
        lista.add(plaskonosa);
        lista.add(gumowa);
        lista.add(wabik);

        for (Kaczka kaczki :lista) {
            kaczki.wyswietl();
            kaczki.plywaj();
            kaczki.wykonajKwakanie();
            kaczki.wykonajLatanie();
            System.out.println();
        }

        kaczka.setKwakanie(new Piszcz());
        kaczka.setLatanie(new LotZNapedemRakietowym());

        for (Kaczka kaczki :lista) {
            kaczki.wyswietl();
            kaczki.plywaj();
            kaczki.wykonajKwakanie();
            kaczki.wykonajLatanie();
            System.out.println();
        }

    }
}
