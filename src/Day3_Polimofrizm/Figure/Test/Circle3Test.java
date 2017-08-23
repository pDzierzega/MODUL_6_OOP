package Day3_Polimofrizm.Figure.Test;

import Day2_Inheritance.Figure.Circle2;
import Day2_Inheritance.Figure.Shape;
import Day3_Polimofrizm.Figure.Circle3;
import org.junit.Assert;
import org.junit.Test;

public class Circle3Test extends ShapeTest{

    @Test
    public void testCircle3Constructor_allMethods(){
        Circle3 testObject=new Circle3();

        Assert.assertEquals("red",testObject.getColor());
        Assert.assertEquals(true,testObject.isFilled());
        Assert.assertEquals("A Shape with color of red and filled",testObject.toString());

        testObject.setColor("black");
        testObject.setFilled(false);

        Assert.assertEquals("black",testObject.getColor());
        Assert.assertEquals(false,testObject.isFilled());
        Assert.assertEquals("A Shape with color of black and not filled",testObject.toString());
    }

    @Test
    public void testCircle3ConstructorColorFilled_allMethods(){
        Circle3 testObject=new Circle3(2,"green",false);

        Assert.assertEquals("green",testObject.getColor());
        Assert.assertEquals(false,testObject.isFilled());
        Assert.assertEquals("A Shape with color of green and not filled",testObject.toString());

        testObject.setColor("pink");
        testObject.setFilled(true);

        Assert.assertEquals("pink",testObject.getColor());
        Assert.assertEquals(true,testObject.isFilled());
        Assert.assertEquals("A Shape with color of pink and filled",testObject.toString());
    }

//    @Test
//    public void testCircle3Constructor_allMethods(){
//    }
}
