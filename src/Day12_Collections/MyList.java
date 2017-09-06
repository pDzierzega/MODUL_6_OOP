package Day12_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        int[] tab1=new int[10];
        Integer[] tab2=new Integer[10];

        for (int i = 0; i <tab1.length ; i++) {
            tab1[i]=i;
            tab2[i]= i;
        }

        List list1=Arrays.asList(tab1);
        List<Integer> list2=Arrays.asList(tab2);

        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(list2);

        ArrayList<Integer> list4=new ArrayList<>();
        list4.addAll(list3);
        Collections.reverse(list4);


    }
}

