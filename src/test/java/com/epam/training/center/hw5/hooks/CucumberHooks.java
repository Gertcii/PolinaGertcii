package com.epam.training.center.hw5.hooks;

import homework5.driver.WebDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void setUp() {
        WebDriverSingleton.getDriver();
    }

    @After
    public void tearDown() {
        WebDriverSingleton.closeDriver();
    }
}
