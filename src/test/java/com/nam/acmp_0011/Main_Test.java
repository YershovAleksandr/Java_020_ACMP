package com.nam.acmp_0011;

import org.junit.Assert;
import org.junit.Test;

public class Main_Test {

    @Test
    public void ShouldAnswerWithTrue(){
        //Assert.assertEquals(42, Main.MyFunc(42,42));

        Assert.assertEquals(1, Main.Factorial(0));
        Assert.assertEquals(1, Main.Factorial(1));
        Assert.assertEquals(2, Main.Factorial(2));
        Assert.assertEquals(6, Main.Factorial(3));
        Assert.assertEquals(24, Main.Factorial(4));
        Assert.assertEquals(120, Main.Factorial(5));
        Assert.assertEquals(720, Main.Factorial(6));
        Assert.assertEquals(5_040, Main.Factorial(7));
        Assert.assertEquals(40_320, Main.Factorial(8));
        Assert.assertEquals(362_880, Main.Factorial(9));
        Assert.assertEquals(3_628_800, Main.Factorial(10));

    }
}
