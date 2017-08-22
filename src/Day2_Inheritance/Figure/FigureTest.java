package Day2_Inheritance.Figure;

import Day2_Inheritance.CircleAndCylinder.*;
import Day2_Inheritance.CircleAndCylinder.Circle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class FigureTest {

    @Test
    public void testShapeConstructor_allMethods(){
        Shape testObject=new Shape();

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
    public void testShapeConstructorColorFilled_allMethods(){
        Shape testObject=new Shape("green",false);

        Assert.assertEquals("green",testObject.getColor());
        Assert.assertEquals(false,testObject.isFilled());
        Assert.assertEquals("A Shape with color of green and not filled",testObject.toString());

        testObject.setColor("pink");
        testObject.setFilled(true);

        Assert.assertEquals("pink",testObject.getColor());
        Assert.assertEquals(true,testObject.isFilled());
        Assert.assertEquals("A Shape with color of pink and filled",testObject.toString());
    }

    @Test
    public void testCircleConstructor_allMethods(){

        // klasy nazywaja sie tak samo ;/
        Day2_Inheritance.Figure.Circle testObject=new Day2_Inheritance.Figure.Circle();

    }
}
