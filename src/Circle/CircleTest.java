package Circle;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void circleDefaultRadiusTest(){
        Circle testObject=new Circle();
        Assert.assertEquals(1.0,testObject.getRadius(),0.01);
    }

    @Test
    public void circleRadius2Test(){
        Circle testObject=new Circle(2);
        Assert.assertEquals(2.0,testObject.getRadius(),0.01);
    }

    @Test
    public void circleDefaultAreaTest(){
        Circle testObject=new Circle();
        Assert.assertEquals(Math.PI,testObject.getArea(),0.01);
    }

    @Test
    public void circleAreaTestWhenProviadeRadius2(){
        Circle testObject=new Circle(2);
        Assert.assertEquals(12.56,testObject.getArea(),0.01);
    }

    @Test
    public void circleDefaulttoStringTest(){
        Circle testObject=new Circle();
        Assert.assertEquals("SimpleCircle[radius=1,00 ,color= red",testObject.toString());
    }
}
