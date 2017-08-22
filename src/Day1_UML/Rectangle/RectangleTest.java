package Day1_UML.Rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldReturnLength1_0WhenProvidedEmptyConstructor(){
        Rectangle testObject=new Rectangle();
        Assert.assertEquals(1.00,testObject.getLength(),0.01);
    }

    @Test
    public void shouldReturnWidth1_0WhenProvidedEmptyConstructor(){
        Rectangle testObject=new Rectangle();
        Assert.assertEquals(1.00,testObject.getWidth(),0.01);
    }

    @Test
    public void shouldReturnArea1_0WhenProvidedEmptyConstructor(){
        Rectangle testObject=new Rectangle();
        Assert.assertEquals(1.00,testObject.getArea(),0.01);
    }

    @Test
    public void shouldReturnPerimeter4_0WhenProvidedEmptyConstructor(){
        Rectangle testObject=new Rectangle();
        Assert.assertEquals(4.00,testObject.getPerimeter(),0.01);
    }

    @Test
    public void shouldReturnLength2_0WhenProvidedEmptyConstructorAndThenSetLength2_0(){
        Rectangle testObject=new Rectangle();
        testObject.setLength(2.0f);
        Assert.assertEquals(2.00,testObject.getLength(),0.01);
    }

    @Test
    public void shouldReturnWidth2_0WhenProvidedEmptyConstructorAndThenSetWidth3_12(){
        Rectangle testObject=new Rectangle();
        testObject.setWidth(3.12f);
        Assert.assertEquals(3.12,testObject.getWidth(),0.01);
    }

    @Test
    public void shouldReturnArea8_22WhenProvidedConstructor4_11And2_0(){
        Rectangle testObject=new Rectangle(4.11f,2.0f);
        Assert.assertEquals(8.22,testObject.getArea(),0.01);
    }

    @Test
    public void shouldReturnPerimeter24_22WhenProvidedEmptyConstructorAndThenSetWidth3_12AndLength8_99(){
        Rectangle testObject=new Rectangle();
        testObject.setWidth(3.12f);
        testObject.setLength(8.99f);
        Assert.assertEquals(24.22,testObject.getPerimeter(),0.01);
    }

    @Test
    public void shouldReturnPerimeter24_22WhenProvidedConstructor3_12And8_99(){
        Rectangle testObject=new Rectangle(3.12f,8.99f);
        Assert.assertEquals(24.22,testObject.getPerimeter(),0.01);
    }

    @Test
    public void toStringTestWhenProvidedEmptyConstructor(){
        Rectangle testObject=new Rectangle();
        Assert.assertEquals("Rectangle[length=1,00 , width=1,00]",testObject.toString());
    }

    @Test
    public void toStringTestWhenProvidedEmptyConstructorAndThenSetWidth2_1091123(){
        Rectangle testObject=new Rectangle();
        testObject.setWidth(2.1091123f);
        Assert.assertEquals("Rectangle[length=1,00 , width=2,11]",testObject.toString());
    }

    @Test
    public void toStringTestWhenProvidedConstructor3_120And144(){
        Rectangle testObject=new Rectangle(3.12f,144);
        Assert.assertEquals("Rectangle[length=3,12 , width=144,00]",testObject.toString());
    }



}
