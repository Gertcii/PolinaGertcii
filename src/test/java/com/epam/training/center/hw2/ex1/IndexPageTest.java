package com.epam.training.center.hw2.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IndexPageTest extends AbstractPage{

    protected String URL= "https://jdi-testing.github.io/jdi-light/index.html";

    @Test
    public void indexPageTest() {

        SoftAssert softAssert = new SoftAssert();
        //open page
            //indexPageSearchResults.openPage(URL);
        driver.get(URL);


        //Assert Browser title
        softAssert.assertEquals(driver.getTitle(), "Home Page");

        //Perform login
        WebElement userIcon = driver.findElement(By.id("user-icon"));
        userIcon.click();
        WebElement loginField = driver.findElement(By.id("name"));
        loginField.sendKeys("Roman");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Jdi1234");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Assert Username is loggined
        String userName = driver.findElement(By.id("user-name")).getText();
        softAssert.assertEquals(userName, "ROMAN IOVLEV");
        //Assert that there are 4 items on the header section are displayed and they have proper texts
        //Assert that there are 4 items on the header section
        List<WebElement> topNavBtnNumber = driver.
                findElements(By.cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8 > li"));
        softAssert.assertEquals(topNavBtnNumber.size(), 4);
        //Assert that 4 items on the header section are displayed and they have proper texts
        WebElement homeBtnOnHeader = driver.
                findElement(By.cssSelector(".m-l8 > li:nth-child(1) > a"));
        softAssert.assertEquals(homeBtnOnHeader.getText(), "HOME");
        softAssert.assertTrue(homeBtnOnHeader.isDisplayed());

        WebElement contactFormBtnOnHeader = driver.
                findElement(By.cssSelector(".m-l8 > li:nth-child(2) > a"));
        softAssert.assertEquals(contactFormBtnOnHeader.getText(), "CONTACT FORM");
        softAssert.assertTrue(contactFormBtnOnHeader.isDisplayed());

        WebElement serviceBtnOnHeader = driver.
                findElement(By.cssSelector(".m-l8 > li:nth-child(3) > a"));
        softAssert.assertEquals(serviceBtnOnHeader.getText(), "SERVICE");
        softAssert.assertTrue(serviceBtnOnHeader.isDisplayed());

        WebElement metalColorsBtnOnHeader = driver.
                findElement(By.cssSelector(".m-l8 > li:nth-child(4) > a"));
        softAssert.assertEquals(metalColorsBtnOnHeader.getText(), "METALS & COLORS");
        softAssert.assertTrue(metalColorsBtnOnHeader.isDisplayed());

        //Assert that there are 4 images on the Index Page and they are displayed
        List<WebElement> benefitIcons = driver.
                findElements(By.className("benefit-icon"));
        softAssert.assertEquals(benefitIcons.size(),4);

        //Assert that there are 4 texts on the Index Page under icons and they have proper text
        //in 4 methods below
        String textBelowIcon1 = "//div[@class = 'benefit']/span[contains(text(),'To include good practices')]";
        WebElement elementBelowIcon1 = driver.findElement(By.xpath(textBelowIcon1));
        softAssert.assertTrue(elementBelowIcon1.isDisplayed());

        String textBelowIcon2 = "//div[@class = 'benefit']/span[contains(text(),'To be flexible and')]";
        WebElement elementBelowIcon2 = driver.findElement(By.xpath(textBelowIcon1));
        softAssert.assertTrue(elementBelowIcon2.isDisplayed());

        String textBelowIcon3 = "//div[@class = 'benefit']/span[contains(text(),'To be multiplatform')]";
        WebElement elementBelowIcon3 = driver.findElement(By.xpath(textBelowIcon1));
        softAssert.assertTrue(elementBelowIcon3.isDisplayed());

        String textBelowIcon4 = "//div[@class = 'benefit']/span[contains(text(),'Already have good base')]";
        WebElement elementBelowIcon4 = driver.findElement(By.xpath(textBelowIcon1));
        softAssert.assertTrue(elementBelowIcon4.isDisplayed());

        //Assert that there is the iframe with “Frame Button” exist
        WebElement frame = driver.findElement(By.id("frame"));
        softAssert.assertTrue(frame.isDisplayed());

        //Get windowHandle to return to that window later
        String windowHandle = driver.getWindowHandle();
        //Switch to the iframe
        driver.switchTo().frame("frame");

        //Check that there is “Frame Button” in the iframe
        WebElement frameBtn = driver.findElement(By.id("button-frame"));
        softAssert.assertTrue(frameBtn.isDisplayed());

        //Switch to original window back
        driver.switchTo().window(windowHandle);

        //Assert that there are 5 items in the Left Section
        //in 5 methods below
        List<WebElement> leftNavBarItems = driver.findElements(By.cssSelector("ul.sidebar-menu > li"));
        softAssert.assertEquals(leftNavBarItems.size(), 5);

        //Assert that 5 items in the Left Section have proper text
        //in 5 methods below
        WebElement homeBtnLeftNav = driver.
                findElement(By.cssSelector("#mCSB_1_container > ul > li.active"));
        softAssert.assertEquals(homeBtnLeftNav.getText(), "Home");

        WebElement contactFormBtnLeftNav = driver.
                findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(2)"));
        softAssert.assertEquals(contactFormBtnLeftNav.getText(), "Contact form");

        WebElement serviceFormBtnLeftNav = driver.
                findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(3)"));
        softAssert.assertEquals(serviceFormBtnLeftNav.getText(), "Service");

        WebElement metalsColorsFormBtnLeftNav = driver.
                findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(4)"));
        softAssert.assertEquals(metalsColorsFormBtnLeftNav.getText(), "Metals & Colors");

        WebElement elementsPacksFormBtnLeftNav = driver.
                findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(5)"));
        softAssert.assertEquals(elementsPacksFormBtnLeftNav.getText(), "Elements packs");


        softAssert.assertAll();
    }

}
