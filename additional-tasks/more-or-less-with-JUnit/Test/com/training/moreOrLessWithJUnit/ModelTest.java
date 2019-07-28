package com.training.moreOrLessWithJUnit;

import org.junit.Assert;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class ModelTest {
    private static Model model;

    @BeforeClass
    public static void runT(){
        model = new Model();
    }

    @org.junit.Test
    public void generateNumberTest() {
        for (int i = 0; i <= 10_000; i++){
            if( (model.generateNumber() == 0) || (model.generateNumber() == 100) ){
                Assert.fail();
            }
        }
    }

    @org.junit.Test
    public void generateNumberWithRangeTest() {
        int min = (int) Math.random()* 5_000;
        int max = (int) (Math.random()* 5_000 + 5_000);

        for (int i = 0; i <= 10_000; i++){
            if( (model.generateNumber(min, max) == min) || (model.generateNumber(min, max) == max) ){
                Assert.fail();
            }
        }
    }
}