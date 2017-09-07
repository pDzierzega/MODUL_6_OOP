package Day13_Repeat;

public class Zad2 {
    char[] chars;

    public Zad2(String text) {
        chars=text.toCharArray();
    }

    public boolean checkBrackets(){
        int i=0;
        for (char c :chars) {
            if (c=='(') i++;
            if (c==')') {
                i--;
                if (i<0) return false;
            }
            }
        return i==0;
    }
}
