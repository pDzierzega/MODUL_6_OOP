package Day3_Polimofrizm.Interface;

public class Main {

    public static void main(String[] args) {

        IPojazd samochod=new Samochód();
        samochod.hamuj(); // mam dostep tylko do metod z interfejsu IPojazd

        ICzterokolowy samochod2=new Samochód();
        samochod2.jedzNaCzolowke(); // mam dostep tylko do metod z interfejsu ICzterokolowy i klasy nadrzednej(IPojazd)

        IPojazd motocykl=new Motocykl();
        motocykl.hamuj(); // mam dostep tylko do metod z interfejsu IPojazd

        Motocykl motocykl2=new Motocykl();
        motocykl2.dodajGazu(); // mam dostep do metod z klasy Motocykl

    }
}
