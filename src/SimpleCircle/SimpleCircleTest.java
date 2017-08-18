package SimpleCircle;

import org.junit.Assert;
import org.junit.Test;

public class SimpleCircleTest {

    @Test
    public void shouldReturnRadius1_0WhenProvidedEmptyConstructor() {
        SimpleCircle testObject=new SimpleCircle();
        Assert.assertEquals(1.0,testObject.getRadius(),0.01);
    }

    @Test
    public void shouldReturnRadius2_54WhenProvidedConstructorWithRadius2_54() {
        SimpleCircle testObject=new SimpleCircle(2.54);
        Assert.assertEquals(2.54,testObject.getRadius(),0.01);
    }

    @Test
    public void shouldReturnRadius3_14WhenProvidedEmptyConstructorAndThenSetRadius3_14() {
        SimpleCircle testObject=new SimpleCircle();
        testObject.setRadius(3.14);
        Assert.assertEquals(3.14,testObject.getRadius(),0.01);
    }

    @Test
    public void shouldReturnArea3_14OneWhenProvidedEmptyConstructor() {
        SimpleCircle testObject=new SimpleCircle();
        Assert.assertEquals(3.14,testObject.getArea(),0.01);
    }

    @Test
    public void shouldReturnArea50_26OneWhenProvidedEmptyConstructorAndThenSetRadius4_0() {
        SimpleCircle testObject=new SimpleCircle();
        testObject.setRadius(4.0);
        Assert.assertEquals(50.26,testObject.getArea(),0.01);
    }

    @Test
    public void shouldReturnCircumference6_28OneWhenProvidedEmptyConstructor() {
        SimpleCircle testObject=new SimpleCircle();
        Assert.assertEquals(6.28,testObject.getCircumference(),0.01);
    }

    @Test
    public void shouldReturnCircumference20_42OneWhenProvidedConstructor3_25() {
        SimpleCircle testObject=new SimpleCircle(3.25);
        Assert.assertEquals(20.42,testObject.getCircumference(),0.01);
    }

    @Test
    public void toStringTestWithEmptyConstructor() {
        SimpleCircle testObject=new SimpleCircle();
        Assert.assertEquals("SimpleCircle[radius=1,00",testObject.toString());
    }

    @Test
    public void toStringTestWhenProvidedConstructor11_98489() {
        SimpleCircle testObject=new SimpleCircle(11.98489);
        Assert.assertEquals("SimpleCircle[radius=11,98",testObject.toString());
    }

    @Test
    public void toStringTestWithEmptyConstructorAndThenSetRadius23_789() {
        SimpleCircle testObject=new SimpleCircle();
        testObject.setRadius(23.789);
        Assert.assertEquals("SimpleCircle[radius=23,79",testObject.toString());
    }

}
