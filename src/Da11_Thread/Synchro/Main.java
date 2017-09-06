package Da11_Thread.Synchro;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ListThreads listOfThreads=new ListThreads();

        Thread t1=new Thread(listOfThreads);
        Thread t2=new Thread(listOfThreads);

        long currentTime=System.currentTimeMillis();

        t1.run();
        t2.run();
        t1.join();
        t2.join();
        System.out.println(System.currentTimeMillis()-currentTime);

        listOfThreads.printStageTwo();
    }
}
