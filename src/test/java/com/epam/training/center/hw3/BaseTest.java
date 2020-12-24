package com.epam.training.center.hw3;

import homework3.ex1.page.Ex1HomePage;
import homework3.ex2.page.Ex2DifferentElementsPage;
import homework3.ex2.page.Ex2HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected WebDriver driver;
    protected Ex1HomePage ex1HomePage;
    protected Ex2HomePage ex2HomePage;
    protected Ex2DifferentElementsPage ex2DifferentElementsPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        driver = null;
        ex1HomePage = null;
        ex2HomePage = null;
        ex2DifferentElementsPage = null;
    }
}
