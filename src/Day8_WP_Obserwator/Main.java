package Day8_WP_Obserwator;

import Day8_WP_Obserwator.Kawiarnia.Dodatki.BitaSmietana;
import Day8_WP_Obserwator.Kawiarnia.Dodatki.Czekolada;
import Day8_WP_Obserwator.Kawiarnia.Dodatki.Mleko;
import Day8_WP_Obserwator.Kawiarnia.Dodatki.Mleko_sojowe;
import Day8_WP_Obserwator.Kawiarnia.Skladniki_Podstawowe.Bezkofeinowa;
import Day8_WP_Obserwator.Kawiarnia.Skladniki_Podstawowe.MocnoPalona;

public class Main {
    public static void main(String[] args) {
        MocnoPalona mocnoPalona = new MocnoPalona();
        Czekolada czekolada = new Czekolada(mocnoPalona);

        System.out.println(czekolada);
        System.out.println(mocnoPalona);

        Bezkofeinowa bezkofeinowa=new Bezkofeinowa();
        Mleko mleko=new Mleko(bezkofeinowa);
        BitaSmietana bitaSmietana=new BitaSmietana(mleko);

        System.out.println(bitaSmietana);

        Mleko mleko2=new Mleko(bitaSmietana);
        Mleko_sojowe mleko_sojowe=new Mleko_sojowe(bitaSmietana);

        System.out.println(mleko2);
        System.out.println(mleko_sojowe);


    }
}
