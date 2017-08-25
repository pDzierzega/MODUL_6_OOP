package Day5_Repeat.Zad1;

import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void testMyTimeEmptyConstructorAllMethods(){
        MyTime testObject=new MyTime();

        Assert.assertEquals("00:00:00",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(0,testObject.getMinute());
        Assert.assertEquals(0,testObject.getSecond());

        testObject.setHour(2);
        testObject.setMinute(45);
        testObject.setSecond(12);
        Assert.assertEquals("02:45:12",testObject.toString());
        Assert.assertEquals(2,testObject.getHour());
        Assert.assertEquals(45,testObject.getMinute());
        Assert.assertEquals(12,testObject.getSecond());

        testObject.nextHour();
        Assert.assertEquals("03:45:12",testObject.toString());
        Assert.assertEquals(3,testObject.getHour());
        Assert.assertEquals(45,testObject.getMinute());
        Assert.assertEquals(12,testObject.getSecond());

        testObject.nextMinute();
        Assert.assertEquals("03:46:12",testObject.toString());
        Assert.assertEquals(3,testObject.getHour());
        Assert.assertEquals(46,testObject.getMinute());
        Assert.assertEquals(12,testObject.getSecond());

        testObject.setTime(12,01,00);
        Assert.assertEquals("12:01:00",testObject.toString());
        Assert.assertEquals(12,testObject.getHour());
        Assert.assertEquals(01,testObject.getMinute());
        Assert.assertEquals(00,testObject.getSecond());

        testObject.previousSecond();
        Assert.assertEquals("12:00:59",testObject.toString());
        Assert.assertEquals(12,testObject.getHour());
        Assert.assertEquals(00,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.previousMinute();
        Assert.assertEquals("11:59:59",testObject.toString());
        Assert.assertEquals(11,testObject.getHour());
        Assert.assertEquals(59,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.previousHour();
        Assert.assertEquals("10:59:59",testObject.toString());
        Assert.assertEquals(10,testObject.getHour());
        Assert.assertEquals(59,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.setTime(12,59,59);
        testObject.nextSecond();
        Assert.assertEquals("13:00:00",testObject.toString());
        Assert.assertEquals(13,testObject.getHour());
        Assert.assertEquals(00,testObject.getMinute());
        Assert.assertEquals(00,testObject.getSecond());
    }

    @org.junit.Test
    public void testMyTimeAllMethods(){
        MyTime testObject=new MyTime(23,12,59);

        Assert.assertEquals("23:12:59",testObject.toString());
        Assert.assertEquals(23,testObject.getHour());
        Assert.assertEquals(12,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.nextHour();
        Assert.assertEquals("00:12:59",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(12,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.nextMinute();
        Assert.assertEquals("00:13:59",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(13,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.nextSecond();
        Assert.assertEquals("00:14:00",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(14,testObject.getMinute());
        Assert.assertEquals(00,testObject.getSecond());


        testObject.previousSecond();
        Assert.assertEquals("00:13:59",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(13,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.setMinute(0);
        testObject.previousMinute();
        Assert.assertEquals("23:59:59",testObject.toString());
        Assert.assertEquals(23,testObject.getHour());
        Assert.assertEquals(59,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

        testObject.setHour(0);
        testObject.previousHour();
        Assert.assertEquals("23:59:59",testObject.toString());
        Assert.assertEquals(23,testObject.getHour());
        Assert.assertEquals(59,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());
    }

    @org.junit.Test
    public void testMyTestInvalidInput(){
        MyTime testObject=new MyTime(25,1,1);

        Assert.assertEquals("00:00:00",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(0,testObject.getMinute());
        Assert.assertEquals(0,testObject.getSecond());

        testObject=new MyTime(11,-78,1);
        Assert.assertEquals("00:00:00",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(0,testObject.getMinute());
        Assert.assertEquals(0,testObject.getSecond());

        testObject=new MyTime(11,-78,96);
        Assert.assertEquals("00:00:00",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(0,testObject.getMinute());
        Assert.assertEquals(0,testObject.getSecond());

        testObject.setHour(-1);
        Assert.assertEquals("00:00:00",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(0,testObject.getMinute());
        Assert.assertEquals(0,testObject.getSecond());

        testObject.setTime(12,-1,10);
        Assert.assertEquals("00:00:00",testObject.toString());
        Assert.assertEquals(0,testObject.getHour());
        Assert.assertEquals(0,testObject.getMinute());
        Assert.assertEquals(0,testObject.getSecond());

        testObject.setTime(12,59,59);
        testObject.setHour(-1);
        Assert.assertEquals("12:59:59",testObject.toString());
        Assert.assertEquals(12,testObject.getHour());
        Assert.assertEquals(59,testObject.getMinute());
        Assert.assertEquals(59,testObject.getSecond());

    }
}
