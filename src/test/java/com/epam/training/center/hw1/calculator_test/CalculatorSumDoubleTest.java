package com.epam.training.center.hw1.calculator_test;

import com.epam.training.center.hw1.data_provider.SumDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSumDoubleTest extends AbstractCalculatorTest {

    @Test(dataProvider = "calculatorSumDoubleData", dataProviderClass = SumDataProvider.class)
    public void calculatorSumTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected, 0.0001);
    }
}
