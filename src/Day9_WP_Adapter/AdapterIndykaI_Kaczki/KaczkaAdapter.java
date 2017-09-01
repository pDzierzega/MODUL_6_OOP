package Day9_WP_Adapter.AdapterIndykaI_Kaczki;

public class KaczkaAdapter implements I_Indyk{

    private I_Kaczka kaczka;

    public KaczkaAdapter(I_Kaczka kaczka) {
        this.kaczka = kaczka;
    }

    @Override
    public void gulgocz() {
        kaczka.kwacz();
    }

    @Override
    public void lataj() {
        kaczka.lataj();
    }
}
