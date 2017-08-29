package Day7_WP_Obserwator.Stacja_pogodowa;

import java.util.ArrayList;

public class DanePogodowe implements I_Podmiot {
    private ArrayList<I_Obserwator> obserwatorzy;
    private float tempertatura;
    private float cisnienie;
    private float wilgotnosc;


    public DanePogodowe(){
        obserwatorzy=new ArrayList<>();
    }

    public void aktualizujZmienne(){
        powiadomObserwatorów();
    }

    @Override
    public void zarejestrujObserwatora(I_Obserwator iObserwator) {
        obserwatorzy.add(iObserwator);
    }

    @Override
    public void usunObserwatora(I_Obserwator iObserwator) {
        obserwatorzy.remove(iObserwator);
    }

    @Override
    public void powiadomObserwatorów() {
        for (I_Obserwator iObserwator :obserwatorzy) {
            iObserwator.aktualizuj(tempertatura,cisnienie,wilgotnosc);
        }
    }

    public void ustawZmienne(float temperautra, float cisnienie, float wilgotnosc){
        this.tempertatura=temperautra;
        this.cisnienie=cisnienie;
        this.wilgotnosc=wilgotnosc;
        aktualizujZmienne();
    }

}
