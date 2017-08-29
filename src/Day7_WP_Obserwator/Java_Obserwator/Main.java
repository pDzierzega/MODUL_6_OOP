package Day7_WP_Obserwator.Java_Obserwator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe_v2 danePogodowe=new DanePogodowe_v2();
        WarunkiBierzace_v2 warunkiBierzace=new WarunkiBierzace_v2(danePogodowe);

        danePogodowe.ustawZmienne(11,1030,45);
        danePogodowe.ustawZmienne(13,1033,46);
    }
}
