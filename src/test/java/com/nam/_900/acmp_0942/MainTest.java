package com.nam._900.acmp_0942;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    public void ShouldAnswerWithTrue(){
        List<Integer> times = new ArrayList<>();

        times.add(40);
        times.add(30);
        times.add(60);

        Assert.assertEquals(240, Main.calcFifth(times));
        Assert.assertEquals(280, Main.calcThird(times));
        Assert.assertEquals(230, Main.calcFirst(times));

        Assert.assertEquals(1, Main.selectWinner(Main.calcFifth(times), Main.calcThird(times), Main.calcFirst(times)));
    }

    @Test
    public void AhouldAnswerWithTrue(){
        List<Integer> times = new ArrayList<>();

        times.add(10);
        times.add(20);
        times.add(30);
        times.add(40);

        Assert.assertEquals(200, Main.calcFifth(times));
        Assert.assertEquals(300, Main.calcThird(times));
        Assert.assertEquals(200, Main.calcFirst(times));

        Assert.assertEquals(1, Main.selectWinner(Main.calcFifth(times), Main.calcThird(times), Main.calcFirst(times)));
    }
}
