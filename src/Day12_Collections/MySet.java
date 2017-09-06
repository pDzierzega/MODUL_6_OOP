package Day12_Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Duda");
        treeSet.add("Morawiecki");
        treeSet.add("Kaczynski");
        treeSet.add("Ziobro");
        treeSet.add("Szydlo");
        treeSet.add("Macierewicz");

        System.out.println(treeSet);

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Petru");
        hashSet.add("Morawiecki");
        hashSet.add("Kaczynski");
        hashSet.add("Ziobro");
        hashSet.add("Kalisz");
        hashSet.add("Schetyna");

        hashSet.retainAll(treeSet);
        System.out.println(hashSet);

        System.out.println(treeSet.higher("Shetyna"));

    }
}
