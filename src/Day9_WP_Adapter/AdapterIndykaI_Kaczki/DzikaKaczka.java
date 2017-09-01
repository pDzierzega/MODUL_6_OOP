package Day9_WP_Adapter.AdapterIndykaI_Kaczki;

public class DzikaKaczka implements I_Kaczka {
    @Override
    public void lataj() {
        System.out.println("Latam bo jestem kura");
    }

    @Override
    public void kwacz() {
        System.out.println("Kwa! Kwa!");
    }
}
