package Day2_Inheritance.CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

public class CircleAndSubclassTest {

    @Test
    public void testCircleDefaultConstructor_allMethods(){
        Circle testObject=new Circle();

        Assert.assertEquals(1.0,testObject.getRadius(),0.01);
        Assert.assertEquals("red",testObject.getColor());
        Assert.assertEquals(3.14,testObject.getArea(),0.01);
        Assert.assertEquals("SimpleCircle[radius=1,00 ,color= red",testObject.toString());

        testObject.setColor("green");
        testObject.setRadius(10);

        Assert.assertEquals(10,testObject.getRadius(),0.01);
        Assert.assertEquals("green",testObject.getColor());
        Assert.assertEquals(314,testObject.getArea(),1);
        Assert.assertEquals("SimpleCircle[radius=10,00 ,color= green",testObject.toString());
    }

    @Test
    public void testCircleConstructorRadius_allMethods(){
        Circle testObject=new Circle(11);

        Assert.assertEquals(11,testObject.getRadius(),0.01);
        Assert.assertEquals("red",testObject.getColor());
        Assert.assertEquals(380,testObject.getArea(),1);
        Assert.assertEquals("SimpleCircle[radius=11,00 ,color= red",testObject.toString());

        testObject.setColor("yellow");
        testObject.setRadius(12);

        Assert.assertEquals(12,testObject.getRadius(),0.01);
        Assert.assertEquals("yellow",testObject.getColor());
        Assert.assertEquals(452,testObject.getArea(),1);
        Assert.assertEquals("SimpleCircle[radius=12,00 ,color= yellow",testObject.toString());
    }

    @Test
    public void testCircleConstructorRadiusAndColor_allMethods(){
        Circle testObject=new Circle(2,"black");

        Assert.assertEquals(2,testObject.getRadius(),0.01);
        Assert.assertEquals("black",testObject.getColor());
        Assert.assertEquals(12.56,testObject.getArea(),0.1);
        Assert.assertEquals("SimpleCircle[radius=2,00 ,color= black",testObject.toString());

        testObject.setColor("gray");
        testObject.setRadius(3);

        Assert.assertEquals(3,testObject.getRadius(),0.01);
        Assert.assertEquals("gray",testObject.getColor());
        Assert.assertEquals(28.26,testObject.getArea(),1);
        Assert.assertEquals("SimpleCircle[radius=3,00 ,color= gray",testObject.toString());
    }

    @Test
    public void testCylinderConstructor_allMethods(){
        Cylinder testObject=new Cylinder();

        Assert.assertEquals(1.0,testObject.getRadius(),0.01);
        Assert.assertEquals(1.0,testObject.getHeight(),0.01);
        Assert.assertEquals("red",testObject.getColor());
        Assert.assertEquals(3.14,testObject.getArea(),0.01);
        Assert.assertEquals(3.14,testObject.getVolume(),0.01);
        Assert.assertEquals("SimpleCircle[radius=1,00 ,color= red",testObject.toString());

        testObject.setColor("yellow");
        testObject.setRadius(12);
        testObject.setHeight(3);

        Assert.assertEquals(12,testObject.getRadius(),0.01);
        Assert.assertEquals(3,testObject.getHeight(),0.01);
        Assert.assertEquals("yellow",testObject.getColor());
        Assert.assertEquals(452,testObject.getArea(),1);
        Assert.assertEquals(1357,testObject.getVolume(),1);
        Assert.assertEquals("SimpleCircle[radius=12,00 ,color= yellow",testObject.toString());
    }

    @Test
    public void testCylinderConstructorRadius_allMethods(){
        Cylinder testObject=new Cylinder(0);

        Assert.assertEquals(0,testObject.getRadius(),0.01);
        Assert.assertEquals(1,testObject.getHeight(),0.01);
        Assert.assertEquals("red",testObject.getColor());
        Assert.assertEquals(0,testObject.getArea(),0.01);
        Assert.assertEquals(0,testObject.getVolume(),0.01);
        Assert.assertEquals("SimpleCircle[radius=0,00 ,color= red",testObject.toString());

        testObject.setColor("green");
        testObject.setRadius(10);
        testObject.setHeight(2);

        Assert.assertEquals(10,testObject.getRadius(),0.01);
        Assert.assertEquals(2,testObject.getHeight(),0.01);
        Assert.assertEquals("green",testObject.getColor());
        Assert.assertEquals(314,testObject.getArea(),1);
        Assert.assertEquals(628,testObject.getVolume(),1);
        Assert.assertEquals("SimpleCircle[radius=10,00 ,color= green",testObject.toString());
    }

    @Test
    public void testCylinderConstructorRadiusHeight_allMethods(){
        Cylinder testObject=new Cylinder(10,0);

        Assert.assertEquals(10,testObject.getRadius(),0.01);
        Assert.assertEquals(0,testObject.getHeight(),0.01);
        Assert.assertEquals("red",testObject.getColor());
        Assert.assertEquals(314,testObject.getArea(),1);
        Assert.assertEquals(0,testObject.getVolume(),0.01);
        Assert.assertEquals("SimpleCircle[radius=10,00 ,color= red",testObject.toString());

        testObject.setColor("black");
        testObject.setRadius(3);
        testObject.setHeight(2);

        Assert.assertEquals(3,testObject.getRadius(),0.01);
        Assert.assertEquals(2,testObject.getHeight(),0.01);
        Assert.assertEquals("black",testObject.getColor());
        Assert.assertEquals(28.26,testObject.getArea(),0.1);
        Assert.assertEquals(56.52,testObject.getVolume(),0.1);
        Assert.assertEquals("SimpleCircle[radius=3,00 ,color= black",testObject.toString());
    }

    @Test
    public void testCylinderConstructorRadiusHeightColor_allMethods(){
        Cylinder testObject=new Cylinder(7,9,"pink");

        Assert.assertEquals(7,testObject.getRadius(),0.01);
        Assert.assertEquals(9,testObject.getHeight(),0.01);
        Assert.assertEquals("pink",testObject.getColor());
        Assert.assertEquals(154,testObject.getArea(),1);
        Assert.assertEquals(1385,testObject.getVolume(),1);
        Assert.assertEquals("SimpleCircle[radius=7,00 ,color= pink",testObject.toString());

        testObject.setColor("purple");
        testObject.setRadius(100);
        testObject.setHeight(100);

        Assert.assertEquals(100,testObject.getRadius(),0.01);
        Assert.assertEquals(100,testObject.getHeight(),0.01);
        Assert.assertEquals("purple",testObject.getColor());
        Assert.assertEquals(31415,testObject.getArea(),1);
        Assert.assertEquals(3141592,testObject.getVolume(),1);
        Assert.assertEquals("SimpleCircle[radius=100,00 ,color= purple",testObject.toString());
    }


}
