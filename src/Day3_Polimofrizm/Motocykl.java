package Day3_Polimofrizm;

public class Motocykl implements IDwukolowy{
    @Override
    public void jedz() {
        System.out.println("Jadę w kasu na motocyklu");
    }

    @Override
    public void hamuj() {
        System.out.println("hamuje !!");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Kask sie przydał. wywrociłem sie z motocyklem");
    }
}
