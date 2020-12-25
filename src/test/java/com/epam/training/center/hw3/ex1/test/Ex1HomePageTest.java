package com.epam.training.center.hw3.ex1.test;

import com.epam.training.center.hw3.BaseTest;
import com.epam.training.center.hw3.ConfigProperties;
import com.epam.training.center.hw3.TestData;
import homework3.HomePage;
import org.testng.annotations.Test;

public class Ex1HomePageTest extends BaseTest {

    @Test
    public void checkingHomePagesElements() {

        homePage = new HomePage(driver);

        /*Ex_1 #1
        open page
        Data - "https://jdi-testing.github.io/jdi-light/index.html"
         */
        /*Ex_1 #2
        assert title
        Data - "Home Page"
         */
        homePage.openPage(ConfigProperties.getProperty("url"), TestData.HOME_PAGE_TITLE.getValue());
        /*Ex_1 #3 #4
        perform login, assert user name
        Data - login: Roman      pass: Jdi1234
               user name ROMAN IOVLEV
         */
        homePage.login(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        /*Ex_1 #4
        assert user name
        Data - user name ROMAN IOVLEV
         */
        homePage.isRightUserName(ConfigProperties.getProperty("userName"));
        /* Exercise 1. #5
        Assert that there are 4 items on the header section and they are displayed
        Data - 4
        */
        homePage.topNavBtnHaveProperNumberAndAreDisplayed(TestData.TOP_NAV_ELEMENT_AMOUNT.getAmount());
        /* Exercise 1. #5.1
        Assert that 4 items on the header section have proper text
        Data - HOME
        */
        homePage.topHomeBtnHasProperText(TestData.HOME_TOP_BTN.getValue());
        /* Exercise 1. #5.2
        Assert that 4 items on the header section have proper text
        Data - "CONTACT FORM"
        */
        homePage.topContactBtnHasProperText(TestData.CONTACT_TOP_BTN.getValue());
        /* Exercise 1. #5.3
        Assert that 4 items on the header section have proper text
        Data - "SERVICE"
        */
        homePage.topServiceBtnHasProperText(TestData.SERVICE_TOP_BTN.getValue());
        /* Exercise 1. #5.4
        Assert that 4 items on the header section have proper text
        Data - METALS & COLORS
        */
        homePage.topMetalAndColorsBtnHasProperText(TestData.METALS_AND_COLORS_TOP_BTN.getValue());
        /* Exercise 1. #6
        Assert that there are 4 images on the Index Page
        Data - 4
        */
        homePage.allIconsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_ICON_NUMBER.getAmount());
        /* Exercise 1. #7.1
        Assert that there are 4 text below images
        Data - 4
        */
        homePage.allBenefitTextsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_TEXT_NUMBER.getAmount());
        /* Exercise 1. #7.1
        Assert that 4 images on the Index Page have proper text
        Data -
        Searched by expected text in 4 methods below
        */
        homePage.textBelowIcon1IsDisplayed();
        homePage.textBelowIcon2IsDisplayed();
        homePage.textBelowIcon3IsDisplayed();
        homePage.textBelowIcon4IsDisplayed();
        /* Exercise 1. #8
        Assert that there is the iframe with “Frame Button” exist
        Data -
        */
        homePage.frameElementIsDisplayed();

        /* Exercise 1. #9
        Switch to the iframe and check that there is “Frame Button” in the iframe
        Data -
        */
        homePage.switchToFrame(driver, TestData.FRAME_ID.getValue());
        homePage.frameBtnIsDisplayed();
        /* Exercise 1. #10
        Switch to original window back
        Data -
        */
        homePage.switchToOriginalWindow(driver);
        /*#11
        Assert that there are 5 items in the Left Section are displayed
        Data - 5
        */
        homePage.leftNavBtnHaveProperNumberAndAreDisplayed(TestData.LEFT_NAV_ELEMENTS_AMOUNT.getAmount());
        /*Exercise 1. #11.1
        Assert that 5 items in the Left Section have proper text
        Data - “Home”
        */
        homePage.leftHomeNavBtnHaveProperText(TestData.HOME_LEFT_BTN.getValue());
        /*Exercise 1. #11.2
        Assert that 5 items in the Left Section have proper text
        Data - “Contact form”
        */
        homePage.leftContactNavBtnHaveProperText(TestData.CONTACT_LEFT_BTN.getValue());
        /*Exercise 1. #11.3
        Assert that 5 items in the Left Section have proper text
        Data - “Service”
        */
        homePage.leftServiceNavBtnHaveProperText(TestData.SERVICE_LEFT_BTN.getValue());
        /*Exercise 1. #11.4
        Assert that 5 items in the Left Section have proper text
        Data - “Metals & Colors”
        */
        homePage.leftMetalAndColorsNavBtnHaveProperText(TestData.METALS_AND_COLORS_LEFT_BTN.getValue());
        /*Exercise 1. #11.5
        Assert that 5 items in the Left Section have proper text
        Data - “Elements packs”
        */
        homePage.leftElementsPackNavBtnHaveProperText(TestData.ELEMENTS_PACKS_LEFT_BTN.getValue());
    }

}
