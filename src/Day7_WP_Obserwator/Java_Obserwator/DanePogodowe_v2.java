package Day7_WP_Obserwator.Java_Obserwator;

import java.util.Observable;

public class DanePogodowe_v2 extends Observable{
    private float tempertatura;
    private float cisnienie;
    private float wilgotnosc;

    public void odczytZmiennych(){
        setChanged();
        notifyObservers();
    }

    public void ustawZmienne(float temperautra, float cisnienie, float wilgotnosc){
        this.tempertatura=temperautra;
        this.cisnienie=cisnienie;
        this.wilgotnosc=wilgotnosc;
        odczytZmiennych();
    }

    public float getTempertatura() {
        return tempertatura;
    }

    public float getCisnienie() {
        return cisnienie;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }
}
