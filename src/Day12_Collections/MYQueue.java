package Day12_Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MYQueue {
    public static void main(String[] args) {
        Person adam=new Person("Adam","0,5L Pana tadeusza. Chusteczki higieniczne");
        Person wincent=new Person("Wincent","Bulka i banan");
        Person herman=new Person("Herman","Papier toaletowy.Gumy do żucia");

        Queue<Person> queue=new PriorityQueue<>();
        queue.add(adam);
        queue.add(wincent);
        queue.add(herman);

        ArrayDeque<Person> deQueue=new ArrayDeque<>();
        deQueue.addAll(queue);

        while (!deQueue.isEmpty()){
            System.out.println(deQueue.removeFirst());
        }

        System.out.println("--------------------------------------------------------");
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        
    }

}
