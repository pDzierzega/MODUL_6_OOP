package Day7_WP_Obserwator.Java_Obserwator;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBierzace_v2 implements I_Wyswietl,Observer{
    private float tempertatura;
    private float cisnienie;
    private float wilgotnosc;
    private Observable danePogodowe;

    public WarunkiBierzace_v2(Observable danePogodowe ) {
        this.danePogodowe=danePogodowe;
        this.danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %.2f C, %.2f hPa, %.2f%%\n",tempertatura,cisnienie,wilgotnosc);
    }

    public void update(DanePogodowe_v2 o,Object arg) {
            this.tempertatura=o.getTempertatura();
            this.cisnienie=o.getCisnienie();
            this.wilgotnosc=o.getWilgotnosc();
            wyswietl();
        }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe_v2){
            DanePogodowe_v2 danePogodowe=(DanePogodowe_v2) o;
            this.tempertatura=danePogodowe.getTempertatura();
            this.cisnienie=danePogodowe.getCisnienie();
            this.wilgotnosc=danePogodowe.getWilgotnosc();
            wyswietl();
        }
    }
}

