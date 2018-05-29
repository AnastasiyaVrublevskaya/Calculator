package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Anastasiya_Urubleusk on 5/28/2018.
 */
public class DoubleDivTest extends CalculatorSetUp{

    @Test(dataProvider = "divDP")
        public void testDiv(Object a, Object b, Object expected){

        Double result = calculator.div(Double.valueOf(String.valueOf(a)), Double.valueOf(String.valueOf(b)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "divDP")
    public Object[][] divDP(){
        return new Object[][]{
                {1.0, 2.0, 0.5},
                {0.0, 1.0, 0.0},
                {"1.0", "2.0", "0.5"},
        };
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivEx(){

        Double result = calculator.div(1.0, 0.0);

    }

}
