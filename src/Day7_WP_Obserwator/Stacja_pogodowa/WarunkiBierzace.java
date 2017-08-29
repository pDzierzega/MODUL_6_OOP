package Day7_WP_Obserwator.Stacja_pogodowa;

public class WarunkiBierzace implements I_Wyswietl,I_Obserwator {
    private float tempertatura;
    private float cisnienie;
    private float wilgotnosc;
    private I_Podmiot danePogodowe;

    public WarunkiBierzace(I_Podmiot danePogodowe ) {
        this.danePogodowe=danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %.2f C, %.2f hPa, %.2f%%\n",tempertatura,cisnienie,wilgotnosc);
    }

    @Override
    public void aktualizuj(float temperatura, float cisnienie, float wilgotnosc) {
        this.tempertatura=temperatura;
        this.cisnienie=cisnienie;
        this.wilgotnosc=wilgotnosc;

        this.wyswietl();
    }
}
