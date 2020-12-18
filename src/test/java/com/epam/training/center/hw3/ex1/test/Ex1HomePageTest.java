package com.epam.training.center.hw3.ex1.test;

import com.epam.training.center.hw3.ConfigProperties;
import com.epam.training.center.hw3.TestData;
import com.epam.training.center.hw3.ex1.page.Ex1HomePage;
import com.epam.training.center.hw3.ex1.page.Ex1LeftNavigationBar;
import com.epam.training.center.hw3.ex1.page.Ex1TopNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ex1HomePageTest {

    private WebDriver driver;
    private Ex1HomePage ex1HomePage;
    private Ex1TopNavigationBar ex1TopNavigationBar;
    private Ex1LeftNavigationBar ex1LeftNavigationBar;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ex1HomePage = new Ex1HomePage(driver);
        ex1TopNavigationBar = new Ex1TopNavigationBar(driver);
        ex1LeftNavigationBar = new Ex1LeftNavigationBar(driver);

    }

    @Test
    public void checkingHomePagesElements() {

        /*Ex_1 #1
        open page
        Data - "https://jdi-testing.github.io/jdi-light/index.html"
         */
        /*Ex_1 #2
        assert title
        Data - "Home Page"
         */
        ex1HomePage.openPage(driver, ConfigProperties.getProperty("url"), TestData.HOME_PAGE_TITLE.getValue());
        /*Ex_1 #3 #4
        perform login, assert user name
        Data - login: Roman      pass: Jdi1234
               user name ROMAN IOVLEV
         */
        ex1HomePage.login(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        /*Ex_1 #4
        assert user name
        Data - user name ROMAN IOVLEV
         */
        ex1HomePage.isRightUserName(ConfigProperties.getProperty("userName"));
        /* Exercise 1. #5
        Assert that there are 4 items on the header section and they are displayed
        Data - 4
        */
        ex1TopNavigationBar.topNavBtnHaveProperNumberAndAreDisplayed(TestData.TOP_NAV_ELEMENT_AMOUNT.getAmount());
        /* Exercise 1. #5.1
        Assert that 4 items on the header section have proper text
        Data - HOME
        */
        ex1TopNavigationBar.topHomeBtnHasProperText(TestData.HOME_TOP_BTN.getValue());
        /* Exercise 1. #5.2
        Assert that 4 items on the header section have proper text
        Data - "CONTACT FORM"
        */
        ex1TopNavigationBar.topContactBtnHasProperText(TestData.CONTACT_TOP_BTN.getValue());
        /* Exercise 1. #5.3
        Assert that 4 items on the header section have proper text
        Data - "SERVICE"
        */
        ex1TopNavigationBar.topServiceBtnHasProperText(TestData.SERVICE_TOP_BTN.getValue());
        /* Exercise 1. #5.4
        Assert that 4 items on the header section have proper text
        Data - METALS & COLORS
        */
        ex1TopNavigationBar.topMetalAndColorsBtnHasProperText(TestData.METALS_AND_COLORS_TOP_BTN.getValue());
        /* Exercise 1. #6
        Assert that there are 4 images on the Index Page
        Data - 4
        */
        ex1HomePage.allIconsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_ICON_NUMBER.getAmount());
        /* Exercise 1. #7.1
        Assert that there are 4 text below images
        Data - 4
        */
        ex1HomePage.allBenefitTextsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_TEXT_NUMBER.getAmount());
        /* Exercise 1. #7.1
        Assert that 4 images on the Index Page have proper text
        Data -
        Searched by expected text in 4 methods below
        */
        ex1HomePage.textBelowIcon1IsDisplayed();
        ex1HomePage.textBelowIcon2IsDisplayed();
        ex1HomePage.textBelowIcon3IsDisplayed();
        ex1HomePage.textBelowIcon4IsDisplayed();
        /* Exercise 1. #8
        Assert that there is the iframe with “Frame Button” exist
        Data -
        */
        ex1HomePage.frameElementIsDisplayed();

        /* Exercise 1. #9
        Switch to the iframe and check that there is “Frame Button” in the iframe
        Data -
        */
        ex1HomePage.switchToFrame(driver, TestData.FRAME_ID.getValue());
        ex1HomePage.frameBtnIsDisplayed();
        /* Exercise 1. #10
        Switch to original window back
        Data -
        */
        ex1HomePage.switchToOriginalWindow(driver);
        /*#11
        Assert that there are 5 items in the Left Section are displayed
        Data - 5
        */
        ex1LeftNavigationBar.leftNavBtnHaveProperNumberAndAreDisplayed(TestData.LEFT_NAV_ELEMENTS_AMOUNT.getAmount());
        /*Exercise 1. #11.1
        Assert that 5 items in the Left Section have proper text
        Data - “Home”
        */
        ex1LeftNavigationBar.leftHomeNavBtnHaveProperText(TestData.HOME_LEFT_BTN.getValue());
        /*Exercise 1. #11.2
        Assert that 5 items in the Left Section have proper text
        Data - “Contact form”
        */
        ex1LeftNavigationBar.leftContactNavBtnHaveProperText(TestData.CONTACT_LEFT_BTN.getValue());
        /*Exercise 1. #11.3
        Assert that 5 items in the Left Section have proper text
        Data - “Service”
        */
        ex1LeftNavigationBar.leftServiceNavBtnHaveProperText(TestData.SERVICE_LEFT_BTN.getValue());
        /*Exercise 1. #11.4
        Assert that 5 items in the Left Section have proper text
        Data - “Metals & Colors”
        */
        ex1LeftNavigationBar.leftMetalAndColorsNavBtnHaveProperText(TestData.METALS_AND_COLORS_LEFT_BTN.getValue());
        /*Exercise 1. #11.5
        Assert that 5 items in the Left Section have proper text
        Data - “Elements packs”
        */
        ex1LeftNavigationBar.leftElementsPackNavBtnHaveProperText(TestData.ELEMENTS_PACKS_LEFT_BTN.getValue());
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
