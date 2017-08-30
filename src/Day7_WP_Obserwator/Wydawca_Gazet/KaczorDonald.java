package Day7_WP_Obserwator.Wydawca_Gazet;

import java.util.ArrayList;


public class KaczorDonald implements I_Wydawca{
    private ArrayList<I_Odbiorca> listaOdbiorcow=new ArrayList<>();
    private String numer;

    @Override
    public void dodajPrenumeratora(I_Odbiorca prenumerator) {
        listaOdbiorcow.add(prenumerator);
    }

    @Override
    public void usunPrenumeratora(I_Odbiorca prenumerator) {
        listaOdbiorcow.remove(prenumerator);
    }

    @Override
    public void wyslijGazete() {
        for (I_Odbiorca odbiorca :listaOdbiorcow) {
            odbiorca.odbierzGazete(numer);
        }
    }

    public void wydajNumer(String numer){
        this.numer=numer;
        wyslijGazete();
    }


}
