package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Anastasiya_Urubleusk on 5/28/2018.
 */
public class PowTest extends CalculatorSetUp{

    @Test(dataProvider = "powDP")
    public void testPow(Object a, Object b, Object expected){

        Double result = calculator.pow(Double.valueOf(String.valueOf(a)), Double.valueOf(String.valueOf(b)));
        Assert.assertEquals(result, Double.valueOf(String.valueOf(expected)));

    }

    @DataProvider(name = "powDP")
    public Object[][] powDP(){
        return new Object[][]{
                {2.0, 2.0, 4.0},
                {1.0, 2.0+5.0, 1.0},
                {"4.0", "0.5", "2.0"},
                {"1.0", "3.0", "1.0"}
        };
    }
}
