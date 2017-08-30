package Day7_WP_Obserwator.Wydawca_Gazet;

public class Main {
    public static void main(String[] args) {
        KaczorDonald kaczorDonald= new KaczorDonald();
        Fakt fakt=new Fakt();

        KubaM kubaM=new KubaM(kaczorDonald);

        //fakt.wydajCalaSerie();
        kaczorDonald.wydajNumer("1/2017");

        kubaM.zaprenumerujGazete(fakt);
        fakt.wydajNumer("0/2018");
        fakt.wydajCalaSerie();

    }
}
