package Day9_WP_Adapter.AdapterIndykaI_Kaczki;

public class IndykAdapter implements I_Kaczka{
    private I_Indyk indyk;

    public IndykAdapter(I_Indyk indyk) {
        this.indyk = indyk;
    }

    @Override
    public void lataj() {
        indyk.lataj();
    }

    @Override
    public void kwacz() {
        indyk.gulgocz();
    }
}
