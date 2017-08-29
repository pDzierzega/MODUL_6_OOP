package Day6_WP_Strategia.SymulatorKaczki;

import Day6_WP_Strategia.SymulatorKaczki.I_Latanie.LotZNapedemRakietowym;
import Day6_WP_Strategia.SymulatorKaczki.I_Kwacz.NieKwacz;

public class KaczkaModel extends Kaczka {

    public KaczkaModel() {
        latanie=new LotZNapedemRakietowym();
        kwakanie=new NieKwacz();
    }


}
