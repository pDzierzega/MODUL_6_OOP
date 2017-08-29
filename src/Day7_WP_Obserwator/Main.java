package Day7_WP_Obserwator;

import Day7_WP_Obserwator.Stacja_pogodowa.DanePogodowe;
import Day7_WP_Obserwator.Stacja_pogodowa.WarunkiBierzace;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe danePogodowe=new DanePogodowe();
        WarunkiBierzace warunkiBierzace=new WarunkiBierzace(danePogodowe);

        danePogodowe.ustawZmienne(11,1030,45);
        danePogodowe.ustawZmienne(13,1033,46);
    }
}
