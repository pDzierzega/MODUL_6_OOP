package Day2_Inheritance.Point;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testPoint2DConstructor_allMethods(){
        Point2D testObject=new Point2D();
        float[] exceptedXY={0.0f,0.0f};

        Assert.assertEquals(0,testObject.getX(),0.01);
        Assert.assertEquals(0,testObject.getY(),0.01);
        Assert.assertArrayEquals(exceptedXY , testObject.getXY(), 0.01f);
        Assert.assertEquals("(0,00 , 0,00)",testObject.toString());


    }
}
