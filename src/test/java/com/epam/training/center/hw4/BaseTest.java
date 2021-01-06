package com.epam.training.center.hw4;

import com.epam.training.center.hw4.ex1.step.Ex1ActionStep;
import com.epam.training.center.hw4.ex1.step.Ex1AssertionStep;
import com.epam.training.center.hw4.ex2.step.Ex2ActionStep;
import com.epam.training.center.hw4.ex2.step.Ex2AssertionStep;
import homework3.DifferentElementsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected WebDriver driver;
    protected Ex1ActionStep ex1ActionStep;
    protected Ex1AssertionStep ex1AssertionStep;
    protected Ex2ActionStep ex2ActionStep;
    protected Ex2AssertionStep ex2AssertionStep;



    @BeforeTest
    public void setUp(ITestContext testContext) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        driver = null;

    }
}
