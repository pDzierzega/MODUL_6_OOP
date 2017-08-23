package Day3_Polimofrizm.AbstractClass;

public class Babcia extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.println("Zostaw ziemniaki");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.println("Wale torba przez leb");
    }
    // czemu to jest ok?
    public void biegnijDoSklepu(int odleglosc, int predkosc){
        double czas=(double) odleglosc/predkosc;
        System.out.println("Biegne po kielbase, bede za"+czas);
    }

    @Override
    public void upieczSzarlotke() {
        System.out.println("Super szarlotka");
    }
}
