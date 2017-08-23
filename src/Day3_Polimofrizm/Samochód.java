package Day3_Polimofrizm;

public class Samochód implements ICzterokolowy {
    @Override
    public void jedz() {
        System.out.println("Jadę");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje silnikiem!");

    }

    @Override
    public void jedzNaCzolowke() {
        System.out.println("Jadę na czołówke");
    }
}

