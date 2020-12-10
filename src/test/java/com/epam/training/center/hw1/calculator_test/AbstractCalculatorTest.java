package com.epam.training.center.hw1.calculator_test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class AbstractCalculatorTest {

    protected Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterTest
    public void tearDown() {
        calculator = null;
    }

}
