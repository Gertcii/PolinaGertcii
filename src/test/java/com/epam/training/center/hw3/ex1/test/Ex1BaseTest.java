package com.epam.training.center.hw3.ex1.test;

import homework3.ex1.page.Ex1HomePage;
import homework3.ex1.page.Ex1LeftNavigationBar;
import homework3.ex1.page.Ex1TopNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public abstract class Ex1BaseTest {

    protected WebDriver driver;
    protected Ex1HomePage ex1HomePage;
    protected Ex1TopNavigationBar ex1TopNavigationBar;
    protected Ex1LeftNavigationBar ex1LeftNavigationBar;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ex1HomePage = new Ex1HomePage(driver);
        ex1TopNavigationBar = new Ex1TopNavigationBar(driver);
        ex1LeftNavigationBar = new Ex1LeftNavigationBar(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        driver = null;
        ex1HomePage = null;
        ex1TopNavigationBar = null;
        ex1LeftNavigationBar = null;
    }
}
