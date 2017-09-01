package Day10_Repeat.Zad1_Strategia;

public class Horse {
    private I_EveenOdd evenOdd;

    public Horse(I_EveenOdd evenOdd) {
        this.evenOdd = evenOdd;
    }

    public void printNumbers(int max){
        evenOdd.printNumbers(max);
    }

    public void setEvenOdd(I_EveenOdd evenOdd) {
        this.evenOdd = evenOdd;
    }
}
