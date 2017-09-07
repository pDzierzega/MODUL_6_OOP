package Day11_Thread.Synchro;

public class MyJoin {
    private int counter;

    public static void main(String[] args) {
        MyJoin main=new MyJoin();
        main.doWork();
    }

    public  synchronized void increment(){
        counter++;
    }

    public  void doWork(){
        Thread t1=new Thread(()->{
                    for (int i = 0; i <10000 ; i++) {
                    counter++;
                    }});

        Thread t2=new Thread(()->{
            for (int i = 0; i <10000 ; i++) {
                counter++;
            }});

        t1.run();
        t2.run();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
