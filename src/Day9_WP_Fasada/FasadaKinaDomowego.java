package Day9_WP_Fasada;

public class FasadaKinaDomowego {
    private Telewizor telewizor;
    private TermoMix termoMix;
    private Wzmacniacz wzmacniacz;

    public FasadaKinaDomowego(Telewizor telewizor, TermoMix termoMix, Wzmacniacz wzmacniacz) {
        this.telewizor = telewizor;
        this.termoMix = termoMix;
        this.wzmacniacz = wzmacniacz;
    }

    public void wrocDoDomu(){
        telewizor.wlacz();
        termoMix.zrobObiad();
        wzmacniacz.wlacz();
        telewizor.wlacz();
        telewizor.ustawKanal("Trwam");
        telewizor.ustawGlosnosc(12);
    }
}
