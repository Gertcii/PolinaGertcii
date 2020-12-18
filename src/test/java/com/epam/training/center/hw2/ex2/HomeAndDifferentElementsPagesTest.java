package com.epam.training.center.hw2.ex2;

import com.epam.training.center.hw2.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeAndDifferentElementsPagesTest extends BaseTest {

    @Test(priority = 1, description = "open page and assert Home Page")

    public void checkingHomeAndDifferentElementsPagesElements() {

        SoftAssert softAssert = new SoftAssert();

        /*Ex_2 #1
        open page
        Data - "https://jdi-testing.github.io/jdi-light/index.html"
         */
        openMainPage();
        /*Ex_2 #2
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
        /*Ex_2 #5
        Open through the header menu Service -> Different Elements Page
        Data -
         */
        navigateToPageViaTopServiceMenu("Different elements");
        Assert.assertEquals(driver.getTitle(), "Different Elements");
        /*Ex_2 #6
        Select checkboxes
        Data -	 Wind
         */
        searchElement(By.cssSelector("label:nth-child(1) > input[type=checkbox]")).click();
        Assert.assertTrue(elementIsSelected(By.cssSelector("label:nth-child(1) > input[type=checkbox]")));
       /*Ex_2 #6
        Select checkboxes
        Data -	 Wind
         */
        searchElement(By.cssSelector("label:nth-child(3) > input[type=checkbox]")).click();
        Assert.assertTrue(elementIsSelected(By.cssSelector("label:nth-child(3) > input[type=checkbox]")));
        /*Ex_2 #7
        Select radio
        Data -	Selen
         */
        searchElement(By.cssSelector("label:nth-child(4) > input[type=radio]")).click();
        Assert.assertTrue(elementIsSelected(By.cssSelector("label:nth-child(4) > input[type=radio]")));
        /*Ex_2 #8
        Select in dropdown
        Data -	Yellow
         */
        searchElement(By.className("colors")).click();
        searchElement(By.cssSelector(".colors > select > option:nth-child(4)")).click();
        Assert.assertTrue(elementIsSelected(By.cssSelector(".colors > select > option:nth-child(4)")));
        /*Ex_2 #9.
        Assert that for each checkbox there is an individual log row
        Data - 4
         */
        int numberOfLogRow = searchElementsList(By.cssSelector(".panel-body-list.logs > li")).size();
        Assert.assertEquals(numberOfLogRow, 4);
        Assert.assertTrue(allElementsAreDisplayed(By.cssSelector(".panel-body-list.logs > li")));
        /*Ex_2 #9.1
        Assert that for each checkbox there is an individual log row
        and value is corresponded to the status of checkbox
        Data -
         */
        softAssert.assertTrue(logRowText("Water: condition changed to true"));
        softAssert.assertTrue(logRowText("Wind: condition changed to true"));
        /*Ex_2 #9.2
        Assert that for radio button there is a log row
        and value is corresponded to the status of radio button
        Data -
         */
        softAssert.assertTrue(logRowText("metal: value changed to  Selen"));
        /*Ex_2 #9.3
        Assert that for dropdown there is a log row
        and value is corresponded to the selected value.
        Data -
         */
        softAssert.assertTrue(logRowText("Colors: value changed to Yellow"));
        softAssert.assertAll();
    }
}
