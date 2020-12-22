package com.epam.training.center.hw3.ex2.test;

import com.epam.training.center.hw3.ConfigProperties;
import com.epam.training.center.hw3.TestData;
import org.testng.annotations.Test;

public class HomeAndDifferentElementsPagesTest extends Ex2BaseTest {

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
        ex2HomePage.openPage(ConfigProperties.getProperty("url"), TestData.HOME_PAGE_TITLE.getValue());
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


}
