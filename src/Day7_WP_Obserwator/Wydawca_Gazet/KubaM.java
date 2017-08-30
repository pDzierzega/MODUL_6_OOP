package Day7_WP_Obserwator.Wydawca_Gazet;

public class KubaM implements I_Odbiorca {

    private I_Wydawca gazeta;

    public KubaM(I_Wydawca gazeta) {
        this.gazeta=gazeta;
        this.gazeta.dodajPrenumeratora(KubaM.this);
    }

    @Override
    public void odbierzGazete(String numer) {
        System.out.printf("Hurrra! Jest numer %s gazety\n",numer);
    }

    public void rezygnujZGazety(){
        gazeta.usunPrenumeratora(this);
    }

    public void zaprenumerujGazete(I_Wydawca gazeta){
        this.gazeta=gazeta;
        this.gazeta.dodajPrenumeratora(this);
    }
}
