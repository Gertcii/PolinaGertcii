package com.epam.training.center.hw4.ex1.test;

import com.epam.training.center.hw4.BaseTest;
import com.epam.training.center.hw4.ConfigProperties;
import com.epam.training.center.hw4.TestData;
import com.epam.training.center.hw4.steps.ActionStep;
import com.epam.training.center.hw4.steps.AssertionStep;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {

    @Test(description = "open home page and check page elements")
    public void checkingHomePagesElements() {

        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);

        actionStep.openPage(ConfigProperties.getProperty("url"));
        assertionStep.titleShouldBeRight(TestData.HOME_PAGE_TITLE.getValue());

        actionStep.login(login, password);
        assertionStep.userNameShouldBeRight(userName);

        assertionStep.topNavBtnShouldBeDisplayedAndHaveProperNumber(TestData.TOP_NAV_ELEMENT_AMOUNT.getAmount());
        assertionStep.topHomeBtnHasProperText(TestData.HOME_TOP_BTN.getValue());
        assertionStep.topContactBtnHasProperText(TestData.CONTACT_TOP_BTN.getValue());
        assertionStep.topServiceBtnHasProperText(TestData.SERVICE_TOP_BTN.getValue());
        assertionStep.topMetalAndColorsBtnHasProperText(TestData.METALS_AND_COLORS_TOP_BTN.getValue());

        assertionStep.allBenefitTextsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_ICON_NUMBER.getAmount());
        assertionStep.allBenefitTextsAreDisplayedAndHaveProperAmount(TestData.BENEFIT_TEXT_NUMBER.getAmount());
        assertionStep.textBelowIcon1IsDisplayed();
        assertionStep.textBelowIcon2IsDisplayed();
        assertionStep.textBelowIcon3IsDisplayed();
        assertionStep.textBelowIcon4IsDisplayed();

        assertionStep.frameElementIsDisplayed();
        actionStep.switchToFrame(driver, TestData.FRAME_ID.getValue());
        assertionStep.frameBtnIsDisplayed();
        actionStep.switchToOriginalWindow(driver);

        assertionStep.leftNavBtnHaveProperNumberAndAreDisplayed(TestData.LEFT_NAV_ELEMENTS_AMOUNT.getAmount());
        assertionStep.leftHomeNavBtnHaveProperText(TestData.HOME_LEFT_BTN.getValue());
        assertionStep.leftContactNavBtnHaveProperText(TestData.CONTACT_LEFT_BTN.getValue());
        assertionStep.leftServiceNavBtnHaveProperText(TestData.SERVICE_LEFT_BTN.getValue());
        assertionStep.leftMetalAndColorsNavBtnHaveProperText(TestData.METALS_AND_COLORS_LEFT_BTN.getValue());
        assertionStep.leftElementsPackNavBtnHaveProperText(TestData.ELEMENTS_PACKS_LEFT_BTN.getValue());
    }
}
