package Da11_Thread.WatkiZImionami;

public class WatekZImieniem implements Runnable {
    private String imie;

    public WatekZImieniem(String imie) {
        this.imie = imie;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.printf("Watek %s wita %d\n",imie,i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Watek %s zegna sie\n",imie);
    }
}
