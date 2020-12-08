package com.epam.training.center.hw1.CalculatorTests;

import com.epam.training.center.hw1.DataProvider.DivisionDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorDivisionDoubleTest extends AbstractCalculatorTest {


    @Test(dataProvider = "calculatorDivisionDoubleData", dataProviderClass = DivisionDataProvider.class)
    public void calculatorDivisionDoubleTest(double a, double b, double expected) {
        double actual = calculator.div(a, b);
        Assert.assertEquals(actual, expected, 0.0001);
    }
}
