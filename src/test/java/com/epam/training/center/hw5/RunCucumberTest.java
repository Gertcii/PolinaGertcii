package com.epam.training.center.hw5;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/homework05"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
