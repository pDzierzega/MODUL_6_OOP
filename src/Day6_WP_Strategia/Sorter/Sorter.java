package Day6_WP_Strategia.Sorter;

import Day6_WP_Strategia.Sorter.I_Sorted.I_Sorted;

public class Sorter {
    private I_Sorted sorted;

    public Sorter(I_Sorted sorted) {
        this.sorted = sorted;
    }

    public void setSorted(I_Sorted sorted) {
        this.sorted = sorted;
    }

    public int[] doSorting(int[] input){
        return sorted.sort(input);
    }
}
