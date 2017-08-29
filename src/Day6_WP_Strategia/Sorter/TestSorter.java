package Day6_WP_Strategia.Sorter;

import Day6_WP_Strategia.Sorter.I_Sorted.Babelkowe;
import Day6_WP_Strategia.Sorter.I_Sorted.I_Sorted;
import Day6_WP_Strategia.Sorter.I_Sorted.Kopiec;
import Day6_WP_Strategia.Sorter.I_Sorted.PrzezZliczanie;
import org.junit.Assert;
import org.junit.Test;

public class TestSorter {
    private int[] input1=    {1,2,3,4,1,2,3,4,12,11};
    private int[] input2=    {1,2,3,4,1,2,3,4,12,11};
    private int[] input=    {1,2,3,4,1,2,3,4,12,11};
    private int[] excepted1= {1,1,2,2,3,3,4,4,11,12};
    private int[] excepted2= {1,1,2,2,3,3,4,4,11,12};
    private int[] excepted= {1,1,2,2,3,3,4,4,11,12};

    private I_Sorted babelkowe=new Babelkowe();
    private I_Sorted kopiec=new Kopiec();
    private I_Sorted przezZliczanie=new PrzezZliczanie();

    //DLACZEGO TEN TEST NIE DZIALA?
    @Test
    public void testSorterAll(){
        Sorter testObject1=new Sorter(babelkowe);
        Sorter testObject2=new Sorter(kopiec);
        Sorter testObject3=new Sorter(przezZliczanie);

        Assert.assertArrayEquals(excepted1,testObject1.doSorting(input1));
        Assert.assertArrayEquals(excepted2,testObject2.doSorting(input2));
        Assert.assertArrayEquals(excepted,testObject3.doSorting(input));
    }

    @Test
    public void test1(){
        Sorter testObject=new Sorter(babelkowe);
        Assert.assertArrayEquals(excepted,testObject.doSorting(input));
    }

    @Test
    public void test2(){
        Sorter testObject=new Sorter(przezZliczanie);
        Assert.assertArrayEquals(excepted,testObject.doSorting(input));
    }

    @Test
    public void test3(){
        Sorter testObject=new Sorter(kopiec);
        Assert.assertArrayEquals(excepted,testObject.doSorting(input));
    }
}
