package Day3_Polimofrizm.AbstractClass;

public abstract class Emeryt implements ISzarlotka{
    public static final int ILOSC_OCZODOLOW=2;

    public abstract void krzyczNaDzieci();
    public abstract void walczOMiejsceWAutobusie();


    private void biegnijDoSklepu(int odleglosc, int predkosc){
        double czas=(double) odleglosc/predkosc;
        System.out.println("Biegne po kielbase, bede za"+czas);
    }

    @Override
    public void upieczSzarlotke() {
        System.out.println("Szarlotka emeryta");
    }

    public static void glupiaStatycznaMetoda(){};
}
