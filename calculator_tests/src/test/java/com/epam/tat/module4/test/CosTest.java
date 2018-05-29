package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Math.PI;

/**
 * Created by Anastasiya_Urubleusk on 5/28/2018.
 */
public class CosTest {

    @Test(dataProvider = "cosDP")
    public void testCos(Object a, Object expected){
        Calculator calculator = new Calculator();
        Double result = calculator.cos(Double.valueOf(String.valueOf(a)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "cosDP")
    public Object[][] cosDP(){
        return new Object[][]{
                {PI/3, 0.5},
                {PI/2, 0.0},
                {2*PI, 1.0},
                {-2*PI, 1.0},
                {PI, -1.0},
                {-PI, -1.0}
        };
    }
}
