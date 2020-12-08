package com.epam.training.center.hw1.DataProvider;

import org.testng.annotations.DataProvider;

public class SumDataProvider {
    @DataProvider
    public Object[][] calculatorSumDoubleData() {
        return new Object[][]{
                {0, 0, 0},
                {0.0, 8, 8.0},
                {-5.0, 2.0, -3.0},
                {-2, -3, -5},
                {-2.2, -3.3, -5.5},
                {Double.MAX_VALUE, -Double.MAX_VALUE, 0}

        };
    }
}
