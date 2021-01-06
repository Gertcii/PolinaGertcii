package com.epam.training.center.hw4.ex1.test;

import com.epam.training.center.hw4.BaseTest;
import com.epam.training.center.hw4.ConfigProperties;
import com.epam.training.center.hw4.TestData;
import com.epam.training.center.hw4.allure_listener.AllureListener;
import com.epam.training.center.hw4.ex1.step.Ex1ActionStep;
import com.epam.training.center.hw4.ex1.step.Ex1AssertionStep;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class HomePageTest extends BaseTest {

    private String url = ConfigProperties.getProperty("url");
    private String login = ConfigProperties.getProperty("login");
    private String password = ConfigProperties.getProperty("password");
    private String userName = ConfigProperties.getProperty("userName");


    @Test(description = "open home page and check page elements")
    public void checkingHomePagesElements(){

        ex1ActionStep = new Ex1ActionStep(driver);
        ex1AssertionStep = new Ex1AssertionStep(driver);

        ex1ActionStep.openPage(ConfigProperties.getProperty("url"));
        ex1AssertionStep.titleShouldBeRight(TestData.HOME_PAGE_TITLE.getValue());

        ex1ActionStep.login(login, password);
        ex1AssertionStep.userNameShouldBeRight(userName);

        ex1AssertionStep.topNavBtnShouldBeDisplayedAndHaveProperNumber(TestData.TOP_NAV_ELEMENT_AMOUNT.getAmount());
        ex1AssertionStep.topHomeBtnHasProperText(TestData.HOME_TOP_BTN.getValue());
        ex1AssertionStep.topContactBtnHasProperText(TestData.CONTACT_TOP_BTN.getValue());
        ex1AssertionStep.topServiceBtnHasProperText(TestData.SERVICE_TOP_BTN.getValue());
        ex1AssertionStep.topMetalAndColorsBtnHasProperText(TestData.METALS_AND_COLORS_TOP_BTN.getValue());

        ex1AssertionStep.allBenefitTextsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_ICON_NUMBER.getAmount());
        ex1AssertionStep.allBenefitTextsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_TEXT_NUMBER.getAmount());
        ex1AssertionStep.textBelowIcon1IsDisplayed();
        ex1AssertionStep.textBelowIcon2IsDisplayed();
        ex1AssertionStep.textBelowIcon3IsDisplayed();
        ex1AssertionStep.textBelowIcon4IsDisplayed();

        ex1AssertionStep.frameElementIsDisplayed();
        ex1ActionStep.switchToFrame(driver, TestData.FRAME_ID.getValue());
        ex1AssertionStep.frameBtnIsDisplayed();
        ex1ActionStep.switchToOriginalWindow(driver);

        ex1AssertionStep.leftNavBtnHaveProperNumberAndAreDisplayed(TestData.LEFT_NAV_ELEMENTS_AMOUNT.getAmount());
        ex1AssertionStep.leftHomeNavBtnHaveProperText(TestData.HOME_LEFT_BTN.getValue());
        ex1AssertionStep.leftContactNavBtnHaveProperText(TestData.CONTACT_LEFT_BTN.getValue());
        ex1AssertionStep.leftServiceNavBtnHaveProperText(TestData.SERVICE_LEFT_BTN.getValue());
        ex1AssertionStep.leftMetalAndColorsNavBtnHaveProperText(TestData.METALS_AND_COLORS_LEFT_BTN.getValue());
        ex1AssertionStep.leftElementsPackNavBtnHaveProperText(TestData.ELEMENTS_PACKS_LEFT_BTN.getValue());
    }
}
