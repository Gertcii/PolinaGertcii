package com.epam.training.center.hw4;

import com.epam.training.center.hw4.allure_listener.AllureListener;
import com.epam.training.center.hw4.steps.ActionStep;
import com.epam.training.center.hw4.steps.AssertionStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

@Listeners({AllureListener.class})
public abstract class BaseTest {

    protected WebDriver driver;
    protected ActionStep actionStep;
    protected AssertionStep assertionStep;
    protected ChromeOptions options;

    protected String url = ConfigProperties.getProperty("url");
    protected String login = ConfigProperties.getProperty("login");
    protected String password = ConfigProperties.getProperty("password");
    protected String userName = ConfigProperties.getProperty("userName");

    @BeforeTest
    public void setUp(ITestContext testContext) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
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
