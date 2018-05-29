package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Math.PI;

/**
 * Created by Anastasiya_Urubleusk on 5/28/2018.
 */
public class CtgTest extends CalculatorSetUp{

    @Test(dataProvider = "ctgDP")
    public void testCtg(Object a, Object expected){

        Double result = calculator.ctg(Double.valueOf(String.valueOf(a)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "ctgDP")
    public Object[][] ctgDP(){
        return new Object[][]{
                {PI/4, 1.0},
                {PI/2, 0.0},
        };
    }

    @Test(dataProvider = "ctgExDP", expectedExceptions = ArithmeticException.class)
    public void testCtgEx(Object a){

        Double result = calculator.ctg(Double.valueOf(String.valueOf(a)));

    }

    @DataProvider(name = "ctgExDP")
    public Object[][] ctgExDP(){
        return new Object[][]{
                {PI},
                {2*PI},
                {"0.0"}
        };
    }
}
