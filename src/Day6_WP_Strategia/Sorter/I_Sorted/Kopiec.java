package Day6_WP_Strategia.Sorter.I_Sorted;

public class Kopiec  implements I_Sorted {
    private int level;
    private int  length;
    private int[] tab;
    private int _root;

    @Override
    public int[] sort (int[] input){
        add(input);
        int[] sorted=new int[length];

        while (length>0){
            length--;
            sorted[length]=_root;
            removeRoot();
        }
        return sorted;
    }


    private void add(int[] input) {
        tab=new int[input.length];
        for (Integer t : input) {
            if (!adoptFather(length, t)) _root=tab[0];
            length++;
        }
        level = level();
    }

    private boolean adoptFather(int index, int data) {
        if (index > 0) {
            int parent = (index - 1) / 2;
            if (tab[parent] < data) {
                tab[index] = tab[parent];
                return adoptFather(parent, data);
            }
        }
        tab[index]=data;
        return index==0? true:false;
    }

    private void removeRoot() {
        levelDown();
        repleceWithBiggerSon(0,tab[length]);
        _root=tab[0];
    }

    private boolean repleceWithBiggerSon (int index, int data){
        if (!isLeaf(index)){
            int n=indexOfBiggerSon(index);
            if (tab[n]>data){
                tab[index]=tab[n];
                return repleceWithBiggerSon(n,data);
            }
        }
        tab[index]=data;
        return true;
    }

    private int indexOfBiggerSon(int i) {
        int first = 2 * i + 1;
        if (first == length) return first;
        int second = first + 1;
        return tab[first] > tab[second] ? first : second;
    }

    private void levelDown() {
        int i = level;
        while ((int) Math.pow(2,i) < length) {
            i--;
        }
        this.level=i;
    }

    private boolean isLeaf (int i){
        return (2*i)>=length;
    }

    private int level() {
        int level = 0;
        while ((int) Math.pow(2,level) < length-1) {
            level++;
        }
        return  level;
    }
}
