package com.epam.training.center.hw1.calculator_test;

import com.epam.training.center.hw1.data_provider.PositiveNumberDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPositiveNumbersTest extends AbstractCalculatorTest {

    @Test(dataProvider = "calculatorPositiveData", dataProviderClass = PositiveNumberDataProvider.class)
    public void positiveTest(int a, boolean expected) {
        boolean actual = calculator.isPositive(a);
        Assert.assertEquals(actual, expected);
    }
}
