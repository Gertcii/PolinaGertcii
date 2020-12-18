package com.epam.training.center.hw3.ex2.test;

import com.epam.training.center.hw3.ConfigProperties;
import com.epam.training.center.hw3.TestData;
import com.epam.training.center.hw3.ex2.page.Ex2DifferentElementsPage;
import com.epam.training.center.hw3.ex2.page.Ex2HomePage;
import com.epam.training.center.hw3.ex2.page.Ex2TopNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeAndDifferentElementsPagesTest {

    private WebDriver driver;
    private Ex2HomePage ex2HomePage;
    private Ex2DifferentElementsPage ex2DifferentElementsPage;
    private Ex2TopNavigationBar ex2TopNavigationBar;

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

    @Test
    public void checkingHomeAndDifferentElementsPagesElements() {
        /*Ex_2 #1
        open page
        Data - "https://jdi-testing.github.io/jdi-light/index.html"
         */
        /*Ex_2 #2
        assert title
        Data - "Home Page"
         */
        ex2HomePage.openPage(driver, ConfigProperties.getProperty("url"), TestData.HOME_PAGE_TITLE.getValue());
        /*Ex_2 #3 #4
        perform login, assert user name
        Data - login: Roman      pass: Jdi1234
               user name ROMAN IOVLEV
         */
        ex2HomePage.login(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        /*Ex_2 #4
        assert user name
        Data - user name ROMAN IOVLEV
         */
        ex2HomePage.isRightUserName(ConfigProperties.getProperty("userName"));
        /*Ex_2 #5
        Open through the header menu Service -> Different Elements Page
        Data -
         */
        ex2TopNavigationBar.navigateToPageByDiffElBtn(TestData.DIFFERENT_ELEMENTS_TITLE.getValue());
        /*Ex_2 #6
        Select checkboxes
        Data -	 Water
         */
        ex2DifferentElementsPage.clickWaterCheckBox();
        ex2DifferentElementsPage.waterCheckboxIsSelected();
        /*Ex_2 #6
        Select checkboxes
        Data -	 Wind
         */
        ex2DifferentElementsPage.clickWindCheckBox();
        ex2DifferentElementsPage.windCheckboxIsSelected();
        /*Ex_2 #7
        Select radio
        Data -	Selen
         */
        ex2DifferentElementsPage.clickSelenRadio();
        ex2DifferentElementsPage.selenRadioIsSelected();
        /*Ex_2 #8
        Select in dropdown
        Data -	Yellow
         */
        ex2DifferentElementsPage.clickColorMenu();
        ex2DifferentElementsPage.clickYellowColor();
        ex2DifferentElementsPage.yellowColorIsSelected();
        /*Ex_2 #9.
        Assert that for each checkbox there is an individual log row
        Data - 4
         */
        ex2DifferentElementsPage.checkNumberOfLogRows(TestData.LOG_ROWS_NUMBER.getAmount());
        /*Ex_2 #9.1
        Assert that water checkbox value is corresponded to the status of checkbox
        Data -
         */
        ex2DifferentElementsPage.rowIsDisplayed(TestData.WATER_ROW_TEXT.getValue());
        /*Ex_2 #9.2
        Assert that wind checkbox value is corresponded to the status of checkbox
        Data -
         */
        ex2DifferentElementsPage.rowIsDisplayed(TestData.WIND_ROW_TEXT.getValue());
        /*Ex_2 #9.3
        Assert that selen radio button there value is corresponded to the status of radio button
        Data -
         */
        ex2DifferentElementsPage.rowIsDisplayed(TestData.SELEN_ROW_TEXT.getValue());
        /*Ex_2 #9.4
        Assert that color value is corresponded to the selected value.
        Data -
         */
        ex2DifferentElementsPage.rowIsDisplayed(TestData.YELLOW_ROW_TEXT.getValue());

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
