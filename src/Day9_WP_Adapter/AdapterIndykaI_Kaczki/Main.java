package Day9_WP_Adapter.AdapterIndykaI_Kaczki;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DzikaKaczka kaczka=new DzikaKaczka();
        DzikiIndyk indyk=new DzikiIndyk();

        IndykAdapter fakeIndyk=new IndykAdapter(indyk);
        KaczkaAdapter fakeKaczka=new KaczkaAdapter(kaczka);

        ArrayList<I_Kaczka> ptaki=new ArrayList<>();
        ptaki.add(kaczka);
        ptaki.add(fakeIndyk);

        ArrayList<I_Indyk> ptaki2=new ArrayList<>();
        ptaki2.add(fakeKaczka);
        ptaki2.add(indyk);

        I_Kaczka fakeIndyk2=new IndykAdapter(indyk);
        I_Kaczka fakeKaczka2=new IndykAdapter(fakeKaczka);
        ptaki.add(fakeIndyk2);
        ptaki.add(fakeKaczka2);

        uruchomKwakanieiLatanie(ptaki);
        uruchomGulgotanieILatanie(ptaki2);
    }

    public static void uruchomKwakanieiLatanie(ArrayList<I_Kaczka> ptaki) {
        for (I_Kaczka kaczka : ptaki) {
            kaczka.lataj();
            kaczka.kwacz();
        }
        System.out.println();
    }

    public static void uruchomGulgotanieILatanie(ArrayList<I_Indyk> ptaki){
        for (I_Indyk indyk :ptaki) {
            indyk.lataj();
            indyk.gulgocz();
        }
        System.out.println();
    }
}
