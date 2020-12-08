package com.epam.training.center.hw1.DataProvider;

import org.testng.annotations.DataProvider;

public class IsPositiveDataProvider {
    @DataProvider
    public Object[][] calculatorIsPositiveData() {
        return new Object[][]{
                {1, true},
                {-1, false},
                {0, false}
        };
    }
}
