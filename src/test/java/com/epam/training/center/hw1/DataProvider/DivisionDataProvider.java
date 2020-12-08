package com.epam.training.center.hw1.DataProvider;

import org.testng.annotations.DataProvider;

public class DivisionDataProvider {
    @DataProvider
    public Object[][] calculatorDivisionDoubleData() {
        return new Object[][]{
                {Double.MAX_VALUE, 1, Double.MAX_VALUE},
                {Double.MIN_VALUE, 1, Double.MIN_VALUE},
                {-5.0, 2.0, -2.5},
                {-5, -2, 2.5},
                {0, 1.1, 0}
        };
    }
}
