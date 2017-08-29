package Day6_WP_Strategia.Sorter.I_Sorted;

public class PrzezZliczanie implements I_Sorted {
    
    @Override
    public int[] sort(int[] input) {
        int max=input[0];
        for (int i = 1; i <input.length ; i++) {
            if (input[i]>max) max=input[i];
        }
        
        int[] temp=new int[max+1];
        for (int i = 0; i <input.length ; i++) {
            temp[input[i]]++;
        }

        int index=0;
        int[] toReturn=new int[input.length];

        for (int i = 0; i <temp.length ; i++) {
            for (int j = 0; j <temp[i] ; j++) {
                toReturn[index]=i;
                index++;
            }
        }
        return toReturn;
    }
}
