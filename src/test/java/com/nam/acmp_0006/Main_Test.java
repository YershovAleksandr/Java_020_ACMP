package com.nam.acmp_0006;

import org.junit.Assert;
import org.junit.Test;

public class Main_Test {

    private String stepE2E4 = "E2-E4";

    private String stepC7D5 = "C7-D5";
    private String stepC7B5 = "C7-B5";
    private String stepD5C7 = "D5-C7";
    private String stepD5E7 = "D5-E7";

    private String stepD5B6 = "D5-B6";
    private String stepD5B4 = "D5-B4";
    private String stepD5F6 = "D5-F6";
    private String stepD5F4 = "D5-F4";


    @Test
    public void shouldAnswerWithTrue(){
        Assert.assertEquals(42, 42);

        Assert.assertEquals(true, Main.isCorrectValue(stepC7D5));
        Assert.assertEquals(true, Main.isCorrectValue(stepE2E4));
    }

    @Test
    public void shouldAnswerWithFalse(){
        Assert.assertNotEquals(true , Main.isCorrectValue("BSN"));
        Assert.assertNotEquals(true , Main.isCorrectValue("BSN3434"));
        Assert.assertNotEquals(true , Main.isCorrectValue("Z5-X4"));
    }

    @Test
    public void correctStepTest(){
        Assert.assertEquals(false, Main.isCorrectStep(stepE2E4));

        Assert.assertEquals(true, Main.isCorrectStep(stepC7D5));
        Assert.assertEquals(true, Main.isCorrectStep(stepC7B5));
        Assert.assertEquals(true, Main.isCorrectStep(stepD5C7));
        Assert.assertEquals(true, Main.isCorrectStep(stepD5E7));
        Assert.assertEquals(true, Main.isCorrectStep(stepD5B6));
        Assert.assertEquals(true, Main.isCorrectStep(stepD5B4));
        Assert.assertEquals(true, Main.isCorrectStep(stepD5F6));
        Assert.assertEquals(true, Main.isCorrectStep(stepD5F4));

    }
}
