package com.nam._000.acmp_0001;

import org.junit.Assert;
import org.junit.Test;

public class Main_Test {

    @Test
    public void shouldAnswerWithTrue(){

        Assert.assertEquals(5, Main.MyFunc(2,3));
        Assert.assertEquals(0, Main.MyFunc(-100,+100));
        Assert.assertEquals(-1, Main.MyFunc(Integer.MIN_VALUE,Integer.MAX_VALUE));
        //Assert.assertEquals(5, acmp_0001.MyFunc(2,3));
    }
}
