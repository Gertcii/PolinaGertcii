package com.epam.training.center.hw4.ex1.step;

import com.epam.training.center.hw4.AbstractStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Ex1AssertionStep extends AbstractStep {

    public Ex1AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("title should be '{title}'")
    public void titleShouldBeRight(String title){
        homePage.checkTheTitle(title);
    }

    @Step("user name should be '{userName}'")
    public void userNameShouldBeRight(String userName){
        homePage.isRightUserName(userName);
    }

    @Step("there should be '{expectedAmount}' top navigation btn displayed")
    public void topNavBtnShouldBeDisplayedAndHaveProperNumber(int expectedAmount){
        homePage.topNavBtnHaveProperNumberAndAreDisplayed(expectedAmount);
    }
    @Step("top navigation btn home should have '{expectedText}' text")
    public void topHomeBtnHasProperText(String expectedText){
        homePage.topHomeBtnHasProperText(expectedText);
    }

    @Step("top navigation btn contact form should have '{expectedText}' text")
    public void topContactBtnHasProperText(String expectedText){
        homePage.topContactBtnHasProperText(expectedText);
    }
    @Step("top navigation btn service should have '{expectedText}' text")
    public void topServiceBtnHasProperText(String expectedText){
        homePage.topServiceBtnHasProperText(expectedText);
    }

    @Step("top navigation btn metal & colors should have '{expectedText}' text")
    public void topMetalAndColorsBtnHasProperText(String expectedText){
        homePage.topMetalAndColorsBtnHasProperText(expectedText);
    }

    @Step("there should be '{expectedAmount}' benefit icons on index page")
    public void allIconsAreDisplayedAndHaveProperAmount(int expectedAmount){
        homePage.allIconsAreDisplayedAndHaveProperAmount(expectedAmount);
    }
    @Step("there should be '{expectedAmount}' benefit text below icons on index page")
    public void allBenefitTextsAreDisplayedAndHaveProperAmount(int expectedAmount){
        homePage.allBenefitTextsAreDisplayedAndHaveProperAmount(expectedAmount);
    }

    @Step("There is text block below icon 1 and it has a proper text")
    public void textBelowIcon1IsDisplayed(){
        homePage.textBelowIcon1IsDisplayed();
    }

    @Step("There is text block below icon 2 and it has a proper text")
    public void textBelowIcon2IsDisplayed(){
        homePage.textBelowIcon2IsDisplayed();
    }

    @Step("There is text block below icon 3 and it has a proper text")
    public void textBelowIcon3IsDisplayed(){
        homePage.textBelowIcon3IsDisplayed();
    }

    @Step("There is text block below icon 4 and it has a proper text")
    public void textBelowIcon4IsDisplayed(){
        homePage.textBelowIcon4IsDisplayed();
    }

    @Step("There should be frame element on index page")
    public void frameElementIsDisplayed(){
        homePage.frameElementIsDisplayed();
    }

    @Step("frame btn should be  displayed")
    public void frameBtnIsDisplayed(){
        homePage.frameBtnIsDisplayed();
    }

    @Step("left navigation bar should have '{expectedAmount}' of btn and be displayed")
    public void leftNavBtnHaveProperNumberAndAreDisplayed(int expectedAmount){
        homePage.leftNavBtnHaveProperNumberAndAreDisplayed(expectedAmount);
    }

    @Step("left nav btn home should have '{expectedText}' text")
    public void leftHomeNavBtnHaveProperText(String expectedText){
        homePage.leftHomeNavBtnHaveProperText(expectedText);
    }

    @Step("left nav btn contact form should have '{expectedText}' text")
    public void leftContactNavBtnHaveProperText(String expectedText){
        homePage.leftContactNavBtnHaveProperText(expectedText);
    }

    @Step("left nav btn service should have '{expectedText}' text")
    public void leftServiceNavBtnHaveProperText(String expectedText){
        homePage.leftServiceNavBtnHaveProperText(expectedText);
    }

    @Step("left nav btn metal & colors should have '{expectedText}' text")
    public void leftMetalAndColorsNavBtnHaveProperText(String expectedText){
        homePage.leftMetalAndColorsNavBtnHaveProperText(expectedText);
    }

    @Step("left nav btn elements packs should have '{expectedText}' text")
    public void leftElementsPackNavBtnHaveProperText(String expectedText){
        homePage.leftElementsPackNavBtnHaveProperText(expectedText);
    }
}
