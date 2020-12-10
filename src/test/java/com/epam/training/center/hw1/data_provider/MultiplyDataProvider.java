package com.epam.training.center.hw1.data_provider;

import org.testng.annotations.DataProvider;

public class MultiplyDataProvider {

    @DataProvider
    public Object[][] calculatorMultiplyDoubleData() {
        return new Object[][]{
                {Double.MAX_VALUE, 1, Double.MAX_VALUE},
                {Double.MIN_VALUE, 1, Double.MIN_VALUE},
                {2, 3, 6},
                {0.0, 8, 0},
                {-5.0, 2.0, -10.0}
        };
    }
}
