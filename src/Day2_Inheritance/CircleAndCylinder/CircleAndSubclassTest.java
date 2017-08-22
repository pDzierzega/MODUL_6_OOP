package Day2_Inheritance.CircleAndCylinder;

import Day2_Inheritance.CircleAndCylinder.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleAndSubclassTest {

    @Test
    public void circleGetRadiusGetAreaTest(){
        Circle testCircle1=new Circle();
        Circle testCircle2=new Circle(2);

        Assert.assertEquals(1.0,testCircle1.getRadius(),0.01);
        Assert.assertEquals(2.0,testCircle2.getRadius(),0.01);
        Assert.assertEquals(3.14,testCircle1.getArea(),0.01);
        Assert.assertEquals(12.56,testCircle2.getArea(),0.01);
    }

    @Test
    public void circleDefaulttoStringTest(){
        Circle testObject=new Circle();
        Assert.assertEquals("SimpleCircle[radius=1,00 ,color= red",testObject.toString());
    }
}
