package com.nam.acmp_0002;

import org.junit.Assert;
import org.junit.Test;

public class Main_Test{

    @Test
    public void shouldAnswerWithTrue() {
        Assert.assertEquals(15, Main.MyFunc(5));
    }

    @Test
    public void shouldAnswerWithTrue2() {
        Assert.assertEquals(21, Main.MyFunc(6));
    }

    @Test
    public void shouldAnswerWithTrue3() {
        Assert.assertEquals(0, Main.MyFunc(-1));
    }

    @Test
    public void shouldAnswerWithTrue4() {
        Assert.assertEquals(-2, Main.MyFunc(-2));
    }

    @Test
    public void shouldAnswerWithTrue5(){
        Assert.assertEquals(-5, Main.MyFunc(-3));
    }
}
