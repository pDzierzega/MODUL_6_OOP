package Day6_WP_Strategia.Sorter.I_Sorted;

public class Babelkowe implements I_Sorted {

    public int[] sort(int[] input) {
        for (int i = 0; i <input.length ; i++) {
            for (int j = 1; j <input.length-i ; j++) {
                if(input[j-1]>input[j]){
                    int temp=input[j-1];
                    input[j-1]=input[j];
                    input[j]=temp;
                }
            }
        }
        return input;
    }
}
