package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static java.lang.Math.PI;

/**
 * Created by Anastasiya_Urubleusk on 5/28/2018.
 */
public class TgTest extends CalculatorSetUp{

    @Test(dataProvider = "tgDP")
    public void testTg(Object a, Object expected){

        Double result = calculator.tg(Double.valueOf(String.valueOf(a)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "tgDP")
    public Object[][] tgDP(){
        return new Object[][]{
                {PI/4, 1.0},
                {PI, 0.0},
                {"0.0", "0.0"}
        };
    }

    @Test(dataProvider = "tgExDP", expectedExceptions = ArithmeticException.class)
    public void testTgEx(Object a){

        Double result = calculator.tg(Double.valueOf(String.valueOf(a)));

    }

    @DataProvider(name = "tgExDP")
    public Object[][] tgExDP(){
        return new Object[][]{
                {PI/2},
                {3*PI/2},
                {"PI/2"}
        };
    }
}
