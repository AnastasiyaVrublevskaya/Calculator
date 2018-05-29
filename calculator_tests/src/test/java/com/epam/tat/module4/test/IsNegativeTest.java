package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Anastasiya_Urubleusk on 5/29/2018.
 */
public class IsNegativeTest extends CalculatorSetUp{


    @Test(groups = "positive")
    public void positiveTest(){

        Assert.assertTrue(calculator.isNegative(-1));

    }

    @Test(groups = "negative")
    public void negativeTest(){

        //Calculator calculator = new Calculator();
        Assert.assertFalse(calculator.isNegative(0));
        Assert.assertFalse(calculator.isNegative(1));

    }


}
