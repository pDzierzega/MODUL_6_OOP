package Day3_Polimofrizm.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Emeryt.glupiaStatycznaMetoda();

        Emeryt babcia=new Babcia();
        babcia.upieczSzarlotke();

        Emeryt emeryt=(Emeryt) babcia;
        emeryt.upieczSzarlotke();

    }
}
