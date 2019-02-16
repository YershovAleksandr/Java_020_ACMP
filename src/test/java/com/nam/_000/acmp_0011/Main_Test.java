package com.nam._000.acmp_0011;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class Main_Test {

    @Test
    public void ShouldAnswerWithTrue(){
        //Assert.assertEquals(42, Main.MyFunc(42,42));

        Assert.assertEquals(new BigDecimal(1), Main.MyFunc(1, 3));
        Assert.assertEquals(new BigDecimal(21), Main.MyFunc(2, 7));
        Assert.assertEquals(new BigDecimal(274), Main.MyFunc(3, 10));

    }
}
