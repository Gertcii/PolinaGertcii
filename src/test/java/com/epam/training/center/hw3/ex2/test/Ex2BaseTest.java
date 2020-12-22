package com.epam.training.center.hw3.ex2.test;

import homework3.ex2.page.Ex2DifferentElementsPage;
import homework3.ex2.page.Ex2HomePage;
import homework3.ex2.page.Ex2TopNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public abstract class Ex2BaseTest {

    protected WebDriver driver;
    protected Ex2HomePage ex2HomePage;
    protected Ex2DifferentElementsPage ex2DifferentElementsPage;
    protected Ex2TopNavigationBar ex2TopNavigationBar;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ex2HomePage = new Ex2HomePage(driver);
        ex2TopNavigationBar = new Ex2TopNavigationBar(driver);
        ex2DifferentElementsPage = new Ex2DifferentElementsPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        driver = null;
        ex2HomePage = null;
        ex2TopNavigationBar = null;
        ex2DifferentElementsPage = null;
    }
}
