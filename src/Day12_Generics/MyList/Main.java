package Day12_Generics.MyList;

public class Main {
    public static void main(String[] args) {
        My_IterateList<Integer> myList=new My_IterateList<>();
        myList.add(1,2,3,4,5);

        System.out.println();

        for (Object integer :myList) {
            System.out.println(integer.toString());
        }

    }
}
