package com.epam.training.center.hw2.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IndexPage2Test extends AbstractPage2{

    protected String URL = "https://jdi-testing.github.io/jdi-light/index.html";

    @Test(priority = 1, description = "open page and assert browser title")
    public void browserTitleText() {
        driver.get(URL);
        Assert.assertEquals(driver.getTitle(), "Home Page");
    }
    //input login and password, assert user name
    @Test(priority = 2)
    public void inputLoginDataTest() {
        WebElement userIcon = driver.findElement(By.id("user-icon"));
        userIcon.click();
        WebElement loginField = driver.findElement(By.id("name"));
        loginField.sendKeys("Roman");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Jdi1234");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        String userName = driver.findElement(By.id("user-name")).getText();
        Assert.assertEquals(userName, "ROMAN IOVLEV");
    }
    //click to service button, click different elements button, assert page is open
    @Test(priority = 3)
    public void openAnotherPageTest() {
        WebElement serviceBtn = driver.findElement(By.cssSelector(".m-l8 > li.dropdown > a"));
        serviceBtn.click();
        WebElement diffElementBtn = driver.findElement(By.cssSelector(".open > ul > li:nth-child(8) > a"));
        diffElementBtn.click();
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
        Assert.assertEquals(driver.getTitle(), "Different Elements");
    }
    //select checkbox water
    @Test(priority = 4)
    public void selectCheckBoxWaterTest(){
        WebElement waterCheckBox = driver.findElement(By.cssSelector("label:nth-child(1) > input[type=checkbox]"));
        waterCheckBox.click();
        Assert.assertTrue(waterCheckBox.isSelected());
    }
    //select checkbox wind
    @Test(priority = 4)
    public void selectCheckBoxWindTest(){
        WebElement windCheckBox = driver.findElement(By.cssSelector("label:nth-child(3) > input[type=checkbox]"));
        windCheckBox.click();
        Assert.assertTrue(windCheckBox.isSelected());
    }
    //select radio selen
    @Test(priority = 4)
    public void selectRadioSelenTest() throws InterruptedException {
        WebElement selenRadio = driver.findElement(By.cssSelector("label:nth-child(4) > input[type=radio]"));
        selenRadio.click();
        Thread.sleep(4000);
        Assert.assertTrue(selenRadio.isSelected());
    }
    //select dropdown color yellow
    @Test(priority = 4)
    public void selectColorTest(){
        WebElement colorDropDownMenu = driver.findElement(By.className("colors"));
        colorDropDownMenu.click();
        WebElement yellowColor = driver.findElement(By.cssSelector(".colors > select > option:nth-child(4)"));
        yellowColor.click();
        Assert.assertTrue(yellowColor.isSelected());
    }
    //assert log row for water is displayed and has proper text
    @Test(priority = 5)
    public void logRowForWaterTest(){
        String expectedText = "Water: condition changed to true";
        WebElement waterLogRow = driver.
                findElement(By.xpath("//li[contains(text(),'" + expectedText +"')]"));
        Assert.assertTrue(waterLogRow.isDisplayed());
    }
    //assert log row for wind is displayed and has proper text
    @Test(priority = 5)
    public void logRowForWindTest(){
        String expectedText = "Wind: condition changed to true";
        WebElement waterLogRow = driver.
                findElement(By.xpath("//li[contains(text(),'" + expectedText +"')]"));
        Assert.assertTrue(waterLogRow.isDisplayed());
    }
    //assert log row for selen is displayed and has proper text
    @Test(priority = 5)
    public void logRowForSelenTest(){
        String expectedText = "metal: value changed to  Selen";
        WebElement waterLogRow = driver.
                findElement(By.xpath("//li[contains(text(),'" + expectedText +"')]"));
        Assert.assertTrue(waterLogRow.isDisplayed());
    }
    //assert log row for yellow color is displayed and has proper text
    @Test(priority = 5)
    public void logRowForYellowTest(){
        String expectedText = "Colors: value changed to Yellow";
        WebElement waterLogRow = driver.
                findElement(By.xpath("//li[contains(text(),'" + expectedText +"')]"));
        Assert.assertTrue(waterLogRow.isDisplayed());
    }

}
