package com.epam.tat.module4.test.JUnit;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.test.CalculatorSetUp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

/**
 * Created by Anastasiya_Urubleusk on 5/29/2018.
 */

    @RunWith(Parameterized.class)
    public class IsNegativeTest {
        private Object value;

        public IsNegativeTest(Object value) {
            this.value = value;
        }

        @Parameterized.Parameters
        public static Iterable<Object[]> dataForTest() {
            return Arrays.asList(new Object[][]{
                    {1},{0},{"13"}
            });
        }

        @Test
        public void paramTest() {

            Calculator calculator = new Calculator();
            assertFalse(calculator.isNegative(Long.valueOf(String.valueOf(value))));

        }
    }
