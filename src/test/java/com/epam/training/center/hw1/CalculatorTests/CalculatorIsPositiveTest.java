package com.epam.training.center.hw1.CalculatorTests;

import com.epam.training.center.hw1.DataProvider.IsPositiveDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorIsPositiveTest extends AbstractCalculatorTest {
    @Test(dataProvider = "calculatorIsPositiveData", dataProviderClass = IsPositiveDataProvider.class)
    public void isPositiveTest(int a, boolean expected) {
        boolean actual = calculator.isPositive(a);
        Assert.assertEquals(actual, expected);
    }
}
