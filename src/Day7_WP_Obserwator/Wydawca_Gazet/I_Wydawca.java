package Day7_WP_Obserwator.Wydawca_Gazet;

public interface I_Wydawca {
    void dodajPrenumeratora (I_Odbiorca prenumerator);
    void usunPrenumeratora (I_Odbiorca prenumerator);
    void wyslijGazete();
}
