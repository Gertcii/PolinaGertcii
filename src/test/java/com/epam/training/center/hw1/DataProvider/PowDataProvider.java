package com.epam.training.center.hw1.DataProvider;

import org.testng.annotations.DataProvider;

public class PowDataProvider {
    @DataProvider
    public Object[][] calculatorPowDoubleData() {
        return new Object[][]{
                {3, 3, 27},
                {0.0, 8, 0},
                {-5.0, 2.0, 25},
                {Double.MAX_VALUE, 1, Double.MAX_VALUE},
                {Double.MIN_VALUE, 1, Double.MIN_VALUE},
                {Double.MAX_VALUE, 0, 1},
                {Double.MIN_VALUE, 0, 1}

        };
    }
}
