package Day3_Polimofrizm.Interface;

public class Rower implements IDwukolowy {
    @Override
    public void jedz() {
        System.out.println("Jadę rowerem");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje pedałami");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Wywracam się");
    }
}
