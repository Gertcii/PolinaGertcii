package com.epam.training.center.hw1.calculator_test;

import com.epam.training.center.hw1.data_provider.MultiplyDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorMultiplyDoubleTest extends AbstractCalculatorTest {

    @Test(dataProvider = "calculatorMultiplyDoubleData", dataProviderClass = MultiplyDataProvider.class)
    public void calculatorMultiplyDoubleTest(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected, 0.0001);
    }
}
