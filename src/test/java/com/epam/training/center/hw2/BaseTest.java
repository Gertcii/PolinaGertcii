package com.epam.training.center.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public enum LoginUser {
        LOGIN("Roman"),
        PASSWORD("Jdi1234"),
        USERNAME("ROMAN IOVLEV");

        private String value;

        LoginUser(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    protected BaseTest.LoginUser loginUser;
    protected WebDriver driver;

    @BeforeTest
    public void browsedSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

    public void openPage(String URL) {
        driver.get(URL);
    }

    public boolean login(LoginUser loginUser) {
        searchElement(By.id("user-icon")).click();
        searchElement(By.id("name")).sendKeys(LoginUser.LOGIN.getValue());
        searchElement(By.id("password")).sendKeys(LoginUser.PASSWORD.getValue());
        searchElement(By.id("login-button")).click();
        return elementText(By.id("user-name")).equals(LoginUser.USERNAME.getValue());
    }

    public WebElement searchElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> searchElementsList(By by) {
        return driver.findElements(by);
    }

    public String elementText(By by) {
        return searchElement(by).getText();
    }

    public boolean elementIsDisplayed(By by) {
        return searchElement(by).isDisplayed();
    }

    public boolean allElementsIsDisplayed(By by) {
        boolean result = false;
        for (WebElement element :
                searchElementsList(by)) {
            if (element.isDisplayed()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean elementIsSelected(By by) {
        return searchElement(by).isSelected();
    }

    public void switchToFrame(String frameId){
        driver.switchTo().frame(frameId);
    }

    public void navigateToPageViaTopServiceMenu(String pageName) {
        String xpathExpression = String
                .format("//ul[@class='dropdown-menu']/li/a[contains(text(),'%s')]", pageName);
        searchElement(By.cssSelector(".m-l8 > li.dropdown > a")).click();
        searchElement(By.xpath(xpathExpression)).click();
    }

    public void navigateToPageViaLeftServiceMenu(String pageName) {
        String xpathExpression = String
                .format("//ul[@class='sub']/li/a/span[contains(text(),'%s')]", pageName);
        searchElement(By.cssSelector(".m-l8 > li.dropdown > a")).click();
        searchElement(By.xpath(xpathExpression)).click();
    }

    public boolean logRowText(String text) {
        return searchElement(By.xpath("//li[contains(text(),'" + text + "')]")).isDisplayed();
    }

}
