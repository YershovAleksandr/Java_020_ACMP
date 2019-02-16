package com.nam._000.acmp_0003;

import org.junit.Assert;
import org.junit.Test;

public class Main_Test {

    @Test
    public void shouldAnswerWithTrue(){
        Assert.assertEquals(5 * 5, Main.MyFunc(5));
        Assert.assertEquals(45 * 45, Main.MyFunc(45));
        Assert.assertEquals(35 * 35, Main.MyFunc(35));
        Assert.assertEquals(95 * 95, Main.MyFunc(95));
        Assert.assertEquals(125 * 125, Main.MyFunc(125));
        Assert.assertEquals(75 * 75, Main.MyFunc(75));
        Assert.assertEquals(4255 * 4255, Main.MyFunc(4255));
    }
}
