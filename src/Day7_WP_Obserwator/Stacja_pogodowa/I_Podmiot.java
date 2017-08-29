package Day7_WP_Obserwator.Stacja_pogodowa;

public interface I_Podmiot {
    public void zarejestrujObserwatora(I_Obserwator iObserwator);
    public void usunObserwatora(I_Obserwator iObserwator);
    public void powiadomObserwatorów();
}
