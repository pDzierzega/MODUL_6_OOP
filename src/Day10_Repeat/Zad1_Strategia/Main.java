package Day10_Repeat.Zad1_Strategia;

public class Main {
    public static void main(String[] args) {
        I_EveenOdd eveen=((int max)-> {int i=0;while (i<max) System.out.println(i+=2);});
        I_EveenOdd odd=((int max)->{int i=1;while (i<max) {System.out.println(i);i+=2;}});

        Horse bonifacy=new Horse(eveen);
        bonifacy.printNumbers(10);

        bonifacy.setEvenOdd(odd);
        bonifacy.printNumbers(10);
    }
}
