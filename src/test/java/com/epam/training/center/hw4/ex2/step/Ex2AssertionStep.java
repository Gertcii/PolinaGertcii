package com.epam.training.center.hw4.ex2.step;

import com.epam.training.center.hw4.AbstractStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Ex2AssertionStep extends AbstractStep {

    public Ex2AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("title should be '{title}'")
    public void titleShouldBeRight(String title) {
        homePage.checkTheTitle(title);
    }

    @Step("user name should be '{userName}'")
    public void userNameShouldBeRight(String userName) {
        homePage.isRightUserName(userName);
    }

    @Step("water chekbox is selected")
    public void waterCheckboxIsSelected() {
        differentElementsPage.waterCheckboxIsSelected();
    }

    @Step("wind chekbox is selected")
    public void windCheckboxIsSelected() {
        differentElementsPage.windCheckboxIsSelected();
    }

    @Step("selen radio is selected")
    public void selenRadioIsSelected(){
        differentElementsPage.selenRadioIsSelected();
    }

    @Step("yellow color is selected")
    public void yellowColorIsSelected(){
        differentElementsPage.yellowColorIsSelected();
    }

    @Step("log row block should has '{expectedAmount}' rows")
    public void checkNumberOfLogRows(int expectedAmount){
        differentElementsPage.checkNumberOfLogRows(expectedAmount);
    }

    @Step("text should be '{expectedText}'")
    public void waterLogRowShouldBeDisplayedAndHaveProperText(String expectedText){
        differentElementsPage.rowIsDisplayed(expectedText);
    }

    @Step("text should be '{expectedText}'")
    public void windLogRowShouldBeDisplayedAndHaveProperText(String expectedText){
        differentElementsPage.rowIsDisplayed(expectedText);
    }

    @Step("text should be '{expectedText}'")
    public void selenLogRowShouldBeDisplayedAndHaveProperText(String expectedText){
        differentElementsPage.rowIsDisplayed(expectedText);
    }

    @Step("text should be '{expectedText}'")
    public void yellowLogRowShouldBeDisplayedAndHaveProperText(String expectedText){
        differentElementsPage.rowIsDisplayed(expectedText);
    }

}
