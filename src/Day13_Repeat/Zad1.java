package Day13_Repeat;

public class Zad1 {
    private char[] chars;
    private char a;

    public Zad1(String text, char a) {
        this.a=Character.toLowerCase(a);
        chars=text.toLowerCase().toCharArray();
    }

    public int run(){
        int toReturn=0;
        for (char c :chars) {
            if (c==a) toReturn++;
        }
        return toReturn;
    }
}
