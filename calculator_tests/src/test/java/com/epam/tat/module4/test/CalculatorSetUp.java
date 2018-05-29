package com.epam.tat.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

/**
 * Created by Anastasiya_Urubleusk on 5/29/2018.
 */
public class CalculatorSetUp {

    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterClass
    public void after(){
        System.out.println("After class");

    }

}
