package Da11_Thread.ProducentKonsument;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread running");
            wait();
            System.out.println("Resumed");
        }
    }


    public void consume() throws InterruptedException {
        Scanner input=new Scanner(System.in);
        synchronized (this){
            notify();
            Thread.sleep(500);
            System.out.println("Waiting for ENTER");
            input.nextLine();
            System.out.println("ENTER pressed");
        }
    }
}
