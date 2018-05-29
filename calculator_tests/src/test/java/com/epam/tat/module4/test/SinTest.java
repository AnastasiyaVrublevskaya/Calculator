package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Math.PI;

/**
 * Created by Anastasiya_Urubleusk on 5/29/2018.
 */
public class SinTest extends CalculatorSetUp{

    @Test(dataProvider = "sinDP")
    public void testSin(Object a, Object expected){
        Double result = calculator.sin(Double.valueOf(String.valueOf(a)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "sinDP")
    public Object[][] sinDP(){
        return new Object[][]{
                {PI/6, 0.5},
                {PI/2, 1.0},
                {PI, 0.0},
                {-PI/6, -0.5},
                {-PI/2, -1.0}
        };
    }
}
