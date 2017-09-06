package Da11_Thread.Synchro;

import java.util.ArrayList;
import java.util.Random;

public class ListThreads implements Runnable {

    private ArrayList<Integer> stageOne= new ArrayList<>();
    private ArrayList<Integer> stageTwo= new ArrayList<>();
    private Object stageOneLocker=new Object();
    private Object stageTwoLocker=new Object();
    private Random random=new Random();
    private int counter;

    public void stageOne() throws InterruptedException {
        synchronized (stageOneLocker) {
        stageOne.add(random.nextInt());
        Thread.sleep(1);
        }
    }

    public void stageTwo() throws InterruptedException {
        synchronized (stageTwoLocker) {
            stageTwo.add(counter);
            Thread.sleep(1);
        }
    }

    public void process() throws InterruptedException {
        for (int i = 0; i <100 ; i++) {
            stageOne();
            stageTwo();
            counter=i;
        }{

        }
    }

    public void printStageTwo(){
        for (int i :stageTwo) {
            System.out.println(i);
        }

    }
    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
