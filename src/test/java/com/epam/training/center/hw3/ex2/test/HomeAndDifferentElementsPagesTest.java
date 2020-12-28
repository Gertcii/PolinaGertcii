package com.epam.training.center.hw3.ex2.test;

import com.epam.training.center.hw3.BaseTest;
import com.epam.training.center.hw3.ConfigProperties;
import com.epam.training.center.hw3.TestData;
import homework3.HomePage;
import homework3.DifferentElementsPage;
import org.testng.annotations.Test;

public class HomeAndDifferentElementsPagesTest extends BaseTest {

    @Test
    public void checkingHomeAndDifferentElementsPagesElements() {

        homePage = new HomePage(driver);
        differentElementsPage = new DifferentElementsPage(driver);

        differentElementsPage = new DifferentElementsPage(driver);
        /*Ex_2 #1
        open page
        Data - "https://jdi-testing.github.io/jdi-light/index.html"
         */
        /*Ex_2 #2
        assert title
        Data - "Home Page"
         */
        homePage.openPage(ConfigProperties.getProperty("url"), TestData.HOME_PAGE_TITLE.getValue());
        /*Ex_2 #3 #4
        perform login, assert user name
        Data - login: Roman      pass: Jdi1234
               user name ROMAN IOVLEV
         */
        homePage.login(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        /*Ex_2 #4
        assert user name
        Data - user name ROMAN IOVLEV
         */
        homePage.isRightUserName(ConfigProperties.getProperty("userName"));
        /*Ex_2 #5
        Open through the header menu Service -> Different Elements Page
        Data -
         */
        homePage.navigateToPageByDiffElBtn(TestData.DIFFERENT_ELEMENTS_TITLE.getValue());
        /*Ex_2 #6
        Select checkboxes
        Data -	 Water
         */
        differentElementsPage.clickWaterCheckBox();
        differentElementsPage.waterCheckboxIsSelected();
        /*Ex_2 #6
        Select checkboxes
        Data -	 Wind
         */
        differentElementsPage.clickWindCheckBox();
        differentElementsPage.windCheckboxIsSelected();
        /*Ex_2 #7
        Select radio
        Data -	Selen
         */
        differentElementsPage.clickSelenRadio();
        differentElementsPage.selenRadioIsSelected();
        /*Ex_2 #8
        Select in dropdown
        Data -	Yellow
         */
        differentElementsPage.selectColor(TestData.YELLOW.getValue());
        differentElementsPage.yellowColorIsSelected();
        /*Ex_2 #9.
        Assert that for each checkbox there is an individual log row
        Data - 4
         */
        differentElementsPage.checkNumberOfLogRows(TestData.LOG_ROWS_NUMBER.getAmount());
        /*Ex_2 #9.1
        Assert that water checkbox value is corresponded to the status of checkbox
        Data -
         */
        differentElementsPage.rowIsDisplayed(TestData.WATER_ROW_TEXT.getValue());
        /*Ex_2 #9.2
        Assert that wind checkbox value is corresponded to the status of checkbox
        Data -
         */
        differentElementsPage.rowIsDisplayed(TestData.WIND_ROW_TEXT.getValue());
        /*Ex_2 #9.3
        Assert that selen radio button there value is corresponded to the status of radio button
        Data -
         */
        differentElementsPage.rowIsDisplayed(TestData.SELEN_ROW_TEXT.getValue());
        /*Ex_2 #9.4
        Assert that color value is corresponded to the selected value.
        Data -
         */
        differentElementsPage.rowIsDisplayed(TestData.YELLOW_ROW_TEXT.getValue());

    }
}
