package Da11_Thread;

public class MyRun implements Runnable{

    private int id;

    public MyRun(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Watek " +id+"."+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
