package com.epam.training.center.hw2.ex1;

import com.epam.training.center.hw2.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends BaseTest {

    @Test
    public void checkingHomePagesElements() {

        SoftAssert softAssert = new SoftAssert();

        /*Ex_1 #1
        open page
        Data - "https://jdi-testing.github.io/jdi-light/index.html"
        */
        openMainPage();
        /*Ex_1 #2
        assert title
        Data - "Home Page"
        */
        Assert.assertEquals(driver.getTitle(), "Home Page");
        /*Ex_2 #3 #4
        perform login, assert user name
        Data - login: Roman      pass: Jdi1234
               user name ROMAN IOVLEV
        */
        Assert.assertTrue(login(loginUser));
        /* Exercise 1. #5
        Assert that there are 4 items on the header section
        Data - 4
        */
        int topNavBtnNumber = searchElementsList(By.cssSelector(".m-l8 > li"))
                .size();
        Assert.assertEquals(topNavBtnNumber, 4);
        /* Exercise 1. #5.1
        Assert that 4 items on the header section have proper text
        Data - HOME
        */
        String homeBtnOnHeader = elementText(By.cssSelector(".m-l8 > li:nth-child(1)"));
        softAssert.assertEquals(homeBtnOnHeader, "HOME");
        Assert.assertTrue(elementIsDisplayed(By.cssSelector(".m-l8 > li:nth-child(1)")));
        /* Exercise 1. #5.2
        Assert that 4 items on the header section have proper text
        Data - "CONTACT FORM"
        */
        String contactFormBtnOnHeader = elementText(By.cssSelector(".m-l8 > li:nth-child(2)"));
        softAssert.assertEquals(contactFormBtnOnHeader, "CONTACT FORM");
        Assert.assertTrue(elementIsDisplayed(By.cssSelector(".m-l8 > li:nth-child(2)")));
        /* Exercise 1. #5.3
        Assert that 4 items on the header section have proper text
        Data - "SERVICE"
        */
        String serviceBtnOnHeader = elementText(By.cssSelector(".m-l8 > li:nth-child(3)"));
        softAssert.assertEquals(serviceBtnOnHeader, "SERVICE");
        Assert.assertTrue(elementIsDisplayed(By.cssSelector(".m-l8 > li:nth-child(3)")));
        /* Exercise 1. #5.4
        Assert that 4 items on the header section have proper text
        Data - METALS & COLORS
        */
        String metalColorsBtnOnHeader = elementText(By.cssSelector(".m-l8 > li:nth-child(4)"));
        softAssert.assertEquals(metalColorsBtnOnHeader, "METALS & COLORS");
        Assert.assertTrue(elementIsDisplayed(By.cssSelector(".m-l8 > li:nth-child(4)")));
        /* Exercise 1. #6
        Assert that there are 4 images on the Index Page
        Data - 4
        */
        int benefitIcons = searchElementsList(By.className("benefit-icon")).size();
        Assert.assertEquals(benefitIcons, 4);
        Assert.assertTrue(allElementsAreDisplayed(By.className("benefit-icon")));
        /* Exercise 1. #7
        Assert that there are 4 text block below icons on the Index Page
        Data - 4
        */
        int benefitTextNumber = searchElementsList(By.className("benefit")).size();
        Assert.assertEquals(benefitTextNumber, 4);
        Assert.assertTrue(allElementsAreDisplayed(By.className("benefit")));
         /* Exercise 1. #7.1
        Assert that 4 images on the Index Page have proper text
        Data -
        Searched by expected text in 4 methods below
        */
        String textBelowIcon1 = "//div[@class = 'benefit']/span[contains(text(),'To include good practices')]";
        softAssert.assertTrue(elementIsDisplayed(By.xpath(textBelowIcon1)));

        String textBelowIcon2 = "//div[@class = 'benefit']/span[contains(text(),'To be flexible and')]";
        softAssert.assertTrue(elementIsDisplayed(By.xpath(textBelowIcon2)));

        String textBelowIcon3 = "//div[@class = 'benefit']/span[contains(text(),'To be multiplatform')]";
        softAssert.assertTrue(elementIsDisplayed(By.xpath(textBelowIcon3)));

        String textBelowIcon4 = "//div[@class = 'benefit']/span[contains(text(),'Already have good base')]";
        softAssert.assertTrue(elementIsDisplayed(By.xpath(textBelowIcon4)));
        /* Exercise 1. #8
        Assert that there is the iframe with “Frame Button” exist
        Data -
        */
        Assert.assertTrue(elementIsDisplayed(By.id("frame")));
        /* Exercise 1. #9
        Switch to the iframe and check that there is “Frame Button” in the iframe
        Data -
        */
        switchToFrame("frame");
        Assert.assertTrue(elementIsDisplayed(By.id("button-frame")));
        /* Exercise 1. #10
        Switch to original window back
        Data -
        */
        driver.switchTo().defaultContent();
        /*#11
        Assert that there are 5 items in the Left Section are displayed
        Data - 5
        */
        int leftNavBarItems = searchElementsList(By.cssSelector(".sidebar-menu > li")).size();
        Assert.assertEquals(leftNavBarItems, 5);
        Assert.assertTrue(allElementsAreDisplayed(By.cssSelector(".sidebar-menu > li")));
        /*Exercise 1. #11.1
        Assert that 5 items in the Left Section have proper text
        Data - “Home”
        */
        String homeBtnLeftNav = elementText(By.cssSelector(".sidebar-menu > li.active"));
        softAssert.assertEquals(homeBtnLeftNav, "Home");
        /*Exercise 1. #11.2
        Assert that 5 items in the Left Section have proper text
        Data - “Contact form”
        */
        String contactFormBtnLeftNav = elementText(By.cssSelector(".sidebar-menu > li:nth-child(2)"));
        softAssert.assertEquals(contactFormBtnLeftNav, "Contact form");
        /*Exercise 1. #11.3
        Assert that 5 items in the Left Section have proper text
        Data - “Service”
        */
        String serviceFormBtnLeftNav = elementText(By.cssSelector(".sidebar-menu > li:nth-child(3)"));
        softAssert.assertEquals(serviceFormBtnLeftNav, "Service");
        /*Exercise 1. #11.4
        Assert that 5 items in the Left Section have proper text
        Data - “Metals & Colors”
        */
        String metalsColorsFormBtnLeftNav = elementText(By.cssSelector(".sidebar-menu > li:nth-child(4)"));
        softAssert.assertEquals(metalsColorsFormBtnLeftNav, "Metals & Colors");
        /*Exercise 1. #11.5
        Assert that 5 items in the Left Section have proper text
        Data - “Elements packs”
        */
        String elementsPacksFormBtnLeftNav = elementText(By.cssSelector(".sidebar-menu > li:nth-child(5)"));
        softAssert.assertEquals(elementsPacksFormBtnLeftNav, "Elements packs");

        softAssert.assertAll();
    }

}
