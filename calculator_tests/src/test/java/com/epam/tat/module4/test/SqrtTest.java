package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Anastasiya_Urubleusk on 5/28/2018.
 */
public class SqrtTest extends CalculatorSetUp{

    @Test(dataProvider = "sqrtDP")
    public void testPow(Object a, Object expected){

        Double result = calculator.sqrt(Double.valueOf(String.valueOf(a)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "sqrtDP")
    public Object[][] sqrtDP(){
        return new Object[][]{
                {25.0, 5.0},
                {9.0, 3.0},
                {"4.0", "2.0"}
        };
    }

    @Test(dataProvider = "sqrtNegDP", expectedExceptions = ArithmeticException.class)
    public void testPowNegative(Object a, Object expected){

        Double result = calculator.sqrt(Double.valueOf(String.valueOf(a)));
        //Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "sqrtNegDP")
    public Object[][] sqrtNegDP(){
        return new Object[][]{
                {-25.0, 5.0},
                {-9.0, 3.0},
                {"-4.0", "2.0"}
        };
    }
}
