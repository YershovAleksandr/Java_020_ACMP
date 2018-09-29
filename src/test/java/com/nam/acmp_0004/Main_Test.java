package com.nam.acmp_0004;

import org.junit.Assert;
import org.junit.Test;

public class Main_Test {

    @Test
    public void shouldAnswerWithTrue(){

        Assert.assertEquals(594, Main.MyFunc(5));
        Assert.assertEquals(297, Main.MyFunc(2));
        Assert.assertEquals(792, Main.MyFunc(7));

    }
}
