package com.nam._000.acmp_0007;

import org.junit.Assert;
import org.junit.Test;

public class Main_Test {


    @Test
    public void checkValTest(){
        Assert.assertEquals("12345", Main.checkValue("012345"));
        Assert.assertEquals("12345", Main.checkValue("0012345"));
        Assert.assertEquals("12345", Main.checkValue("00012345"));
        Assert.assertEquals("12345", Main.checkValue("000012345"));

        Assert.assertEquals("123450", Main.checkValue("0123450"));
        Assert.assertEquals("1234500", Main.checkValue("001234500"));
        Assert.assertEquals("12345000", Main.checkValue("00012345000"));
        Assert.assertEquals("123450000", Main.checkValue("0000123450000"));

    }

    @Test
    public void shouldAnswerWithTrue(){

        Assert.assertEquals(true, Main.maxValue("1111", "111"));
        Assert.assertEquals(true, Main.maxValue("2222", "1111"));
        Assert.assertEquals(true, Main.maxValue("6666666666666666666666666", "3333333333333333333333333"));
    }

    @Test
    public void shouldAnswerWithFalse(){
        Assert.assertEquals(false, Main.maxValue("111", "1111"));
        Assert.assertEquals(false, Main.maxValue("1111", "2222"));
        Assert.assertEquals(false, Main.maxValue("3333333333333333333333333", "6666666666666666666666666"));
    }
}
