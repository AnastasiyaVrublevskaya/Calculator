package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Anastasiya_Urubleusk on 5/29/2018.
 */
public class IsPositiveTest extends CalculatorSetUp{

    @Test(dataProvider = "positiveDP", groups = "positive")
    public void positiveTest(Object a){

        Assert.assertTrue(calculator.isPositive(Long.valueOf(String.valueOf(a))));

    }

    @DataProvider(name = "positiveDP")
    public Object[][] positiveDP(){
        return new Object[][]{
                {4/5},
                {13},
                {"100"},
        };
    }

    @Test(dataProvider = "negativeDP", groups = "negative")
    public void negativeTest(Object a){

        //Calculator calculator = new Calculator();
        Assert.assertFalse(calculator.isPositive(Long.valueOf(String.valueOf(a))));

    }

    @DataProvider(name = "negativeDP")
    public Object[][] negativeDP(){
        return new Object[][]{
                {-13},
                {0},
                {"-333"}
        };
    }
}
