package Day3_Polimofrizm.AbstractClass;

public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.println("Za moich czasów..!");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.println("Wali laska po nogach");
    }

    public void zapalPapierosa(){
        System.out.println("Pale papierocha");
    }

    @Override
    public void upieczSzarlotke() {
        System.out.println("Slaba szarlotka ale z pradem");
    }
}
