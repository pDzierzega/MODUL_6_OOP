package MyPointAndMyCircle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyCircleTest {
    MyPoint testPoint=new MyPoint(2,2);

    MyCircle testCircle1 =new MyCircle();
    MyCircle testCircle2=new MyCircle(1,1,2);
    MyCircle testCircle3=new MyCircle(testPoint,3);

    @Test
    public void MyCircleConstructorAndGetTest() {

        Assert.assertEquals(0, testCircle1.getCenterX());
        Assert.assertEquals(1, testCircle2.getCenterX());
        Assert.assertEquals(2, testCircle3.getCenterX());

        Assert.assertEquals(0, testCircle1.getCenterY());
        Assert.assertEquals(1, testCircle2.getCenterY());
        Assert.assertEquals(2, testCircle3.getCenterY());

        Assert.assertEquals(1, testCircle1.getRadius());
        Assert.assertEquals(2, testCircle2.getRadius());
        Assert.assertEquals(3, testCircle3.getRadius());

        Assert.assertEquals(testPoint, testCircle3.getCenter());
    }

    @Test
    public void MyCircleSerRadiusTest() {
        testCircle1.setRadius(11);
        testCircle2.setRadius(22);

        Assert.assertEquals(11,testCircle1.getRadius(),0.01);
        Assert.assertEquals(22,testCircle2.getRadius(),0.01);
    }

    @Test
    public void MyCircleSetAndGetCenterXYTest() {
        testCircle1.setCenterX(11);
        testCircle1.setCenterY(22);
        Assert.assertEquals(11,testCircle1.getCenterX());
        Assert.assertEquals(22,testCircle1.getCenterY());

        int[] exceptedOutput={-1,99};
        testCircle2.setCenterXY(-1,99);
        Assert.assertArrayEquals(exceptedOutput,testCircle2.getCenterXY());

        testCircle3.setCenterXY(-11,-99);
        Assert.assertEquals(-11,testCircle3.getCenterX());
        Assert.assertEquals(-99,testCircle3.getCenterY());

        Assert.assertEquals(-11,testPoint.getX());
        Assert.assertEquals(-99,testPoint.getY());

        testCircle1.setCenter(testPoint);
        Assert.assertEquals(-11,testCircle1.getCenterX());
        Assert.assertEquals(-99,testCircle1.getCenterY());
    }






}
