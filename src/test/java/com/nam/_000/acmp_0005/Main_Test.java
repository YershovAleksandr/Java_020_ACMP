package com.nam._000.acmp_0005;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Main_Test {

    private int[] days1 = {4, 16, 19, 31, 2};
    private int[] days2 = {29, 4, 7, 12, 15, 17, 24, 1};


    @Test
    public void shouldAnswerWithTrue(){
        Assert.assertEquals("Hello", 42, 42);
    }


    @Test
    public void isOddTrue(){
        Assert.assertTrue(Main.isOdd(-177));
        Assert.assertTrue(Main.isOdd(-1));
        //Assert.assertTrue(Main.isOdd(0));
        Assert.assertTrue(Main.isOdd(1));
        Assert.assertTrue(Main.isOdd(3));
        Assert.assertTrue(Main.isOdd(5));
        Assert.assertTrue(Main.isOdd(11));
        Assert.assertTrue(Main.isOdd(125));
    }


    @Test
    public void isOddFalse(){
        Assert.assertFalse(Main.isOdd(-100));
        Assert.assertFalse(Main.isOdd(-2));
        Assert.assertFalse(Main.isOdd(0));
        Assert.assertFalse(Main.isOdd(2));
        Assert.assertFalse(Main.isOdd(2));
        Assert.assertFalse(Main.isOdd(4));
        Assert.assertFalse(Main.isOdd(6));
        Assert.assertFalse(Main.isOdd(16));
        Assert.assertFalse(Main.isOdd(1024));
    }

    @Test
    public void isOdddaysTest(){

        Assert.assertEquals(Arrays.asList(19, 31), Main.numberDays(days1,true));
        Assert.assertEquals(Arrays.asList(29, 7, 15, 17, 1), Main.numberDays(days2,true));
    }

    @Test
    public void isNotOddDaysTest(){
        Assert.assertEquals(Arrays.asList(4, 16, 2), Main.numberDays(days1, false));
        Assert.assertEquals(Arrays.asList(4, 12, 24), Main.numberDays(days2, false));
    }
}
