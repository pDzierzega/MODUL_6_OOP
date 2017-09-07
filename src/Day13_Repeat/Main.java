package Day13_Repeat;

public class Main {
    public static void main(String[] args) {
        Zad1 zad1=new Zad1("a AlA ma kota",'a');
        System.out.println(zad1.run());

        //Zad2 zad2=new Zad2("2*(3.4-(-7)/2)*(a-2)/(b-1)))");
        Zad2 zad2=new Zad2("()()");
        System.out.println(zad2.checkBrackets());

        Zad3 zad3=new Zad3(1000000);
    }
}
