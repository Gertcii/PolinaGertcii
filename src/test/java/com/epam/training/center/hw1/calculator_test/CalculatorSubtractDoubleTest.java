package com.epam.training.center.hw1.calculator_test;

import com.epam.training.center.hw1.data_provider.SubtractDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorSubtractDoubleTest extends AbstractCalculatorTest {

    @Test(dataProvider = "calculatorSubtractDoubleData", dataProviderClass = SubtractDataProvider.class)
    public void calculatorSubtractDoubleTest(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected, 0.0001);
    }
}
