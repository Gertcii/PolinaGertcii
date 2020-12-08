package com.epam.training.center.hw1.DataProvider;

import org.testng.annotations.DataProvider;

public class SubtractDataProvider {
    @DataProvider
    public Object[][] calculatorSubtractDoubleData() {
        return new Object[][]{
                {2, 3, -1},
                {0.0, 8, -8.0},
                {-5.0, 2.0, -7.0},
                {Double.MAX_VALUE, Double.MAX_VALUE, 0},
                {Double.MIN_VALUE, Double.MIN_VALUE, 0}
        };
    }
}
