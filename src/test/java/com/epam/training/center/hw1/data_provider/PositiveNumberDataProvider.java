package com.epam.training.center.hw1.data_provider;

import org.testng.annotations.DataProvider;

public class PositiveNumberDataProvider {

    @DataProvider
    public Object[][] calculatorPositiveData() {
        return new Object[][]{
                {1, true},
                {-1, false},
                {0, false}
        };
    }
}
