package MyPointAndMyCircle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyPointTest {

    @Test
    public void MyPointDefaultConstructorAndGetAndSetTest(){
        MyPoint testObject=new MyPoint();

        Assert.assertEquals(0,testObject.getX());
        Assert.assertEquals(0,testObject.getY());

        testObject.setXY(1,11);
        Assert.assertEquals(1,testObject.getX());
        Assert.assertEquals(11,testObject.getY());

        testObject.setX(100);
        testObject.setY(-100);
        Assert.assertEquals(100,testObject.getX());
        Assert.assertEquals(-100,testObject.getY());

    }

    @Test
    public void MyPointDistanceTest(){
        MyPoint p1=new MyPoint();
        MyPoint p2=new MyPoint(3,4);

        Assert.assertEquals(0,p1.distance(),0.01);
        Assert.assertEquals(5,p2.distance(),0.01);
        Assert.assertEquals(p2.distance(),p2.distance(p1),0.01);

        Assert.assertEquals(5,p1.distance(4,3),0.01);

        p1.setXY(3,4);
        Assert.assertEquals(0,p1.distance(p2),0.00);
    }
}
