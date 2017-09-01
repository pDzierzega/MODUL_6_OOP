package Day9_WP_Adapter.AdapterIndykaI_Kaczki;

public class DzikiIndyk implements I_Indyk{
    @Override
    public void gulgocz() {
        System.out.println("Gulgulgugugu!");
    }

    @Override
    public void lataj() {
        System.out.println("Latam?! ale tylko na krótkim dytstansie");
    }
}
