package com.epam.training.center.hw1.calculator_test;

import com.epam.training.center.hw1.data_provider.PowDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorPowDoubleTest extends AbstractCalculatorTest {

    @Test(dataProvider = "calculatorPowDoubleData", dataProviderClass = PowDataProvider.class)
    public void calculatorPowDoubleTest(double a, double b, double expected) {
        double actual = calculator.pow(a, b);
        assertEquals(actual, expected, 0.0001);
    }
}
