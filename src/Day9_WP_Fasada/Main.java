package Day9_WP_Fasada;

public class Main {
    public static void main(String[] args) {
        Telewizor tv=new Telewizor();
        TermoMix termoMix=new TermoMix();
        Wzmacniacz wzmacniacz=new Wzmacniacz();

        FasadaKinaDomowego kinoDomowe=new FasadaKinaDomowego(tv,termoMix,wzmacniacz);
    }
}
