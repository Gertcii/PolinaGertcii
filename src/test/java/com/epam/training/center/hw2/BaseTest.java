package com.epam.training.center.hw2;

import com.epam.training.center.hw2.enums.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public abstract class BaseTest {

    protected LoginUser loginUser;
    protected WebDriver driver;
    private String URL = "https://jdi-testing.github.io/jdi-light/index.html";

    @BeforeTest
    public void browsedSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginUser = LoginUser.DEFAULT_USER;
    }

    @AfterTest
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

    public void openPage(String URL) {
        driver.get(URL);
    }

    public void openMainPage() {
        driver.get(URL);
    }

    public boolean login(LoginUser loginUser) {
        searchElement(By.id("user-icon")).click();
        searchElement(By.id("name")).sendKeys(loginUser.getLogin());
        searchElement(By.id("password")).sendKeys(loginUser.getPassword());
        searchElement(By.id("login-button")).click();
        return elementText(By.id("user-name")).equals(loginUser.getUserName());
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

    public boolean allElementsAreDisplayed(By by) {

        //Stream<WebElement> elementStream = Stream.of(searchElement(by));
        List<WebElement> elementList = searchElementsList(by);
        boolean result = elementList.stream().anyMatch(element -> !element.isDisplayed());
        return !result;
    }

    public boolean elementIsSelected(By by) {
        return searchElement(by).isSelected();
    }

    public void switchToFrame(String frameId) {
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
