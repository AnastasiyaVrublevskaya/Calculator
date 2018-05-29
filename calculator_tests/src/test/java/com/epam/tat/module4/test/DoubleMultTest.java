package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Anastasiya_Urubleusk on 5/28/2018.
 */
public class DoubleMultTest extends CalculatorSetUp{

    @Test(dataProvider = "multDP")
    public void testMult(Object a, Object b, Object expected){

        Double result = calculator.mult(Double.valueOf(String.valueOf(a)), Double.valueOf(String.valueOf(b)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "multDP")
    public Object[][] multDP(){
        return new Object[][]{
                {1.0, 2.0, 2.0},
                {1.1, 1.1, 1.21},
                {"2.5", "-3.0", "-7.5"}
        };
    }
}
