package com.epam.training.center.hw4.ex2.test;

import com.epam.training.center.hw4.BaseTest;
import com.epam.training.center.hw4.ConfigProperties;
import com.epam.training.center.hw4.TestData;
import com.epam.training.center.hw4.allure_listener.AllureListener;
import com.epam.training.center.hw4.ex2.step.Ex2ActionStep;
import com.epam.training.center.hw4.ex2.step.Ex2AssertionStep;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class HomeAndDifferentElementsPageTest extends BaseTest {

    private String url = ConfigProperties.getProperty("url");
    private String login = ConfigProperties.getProperty("login");
    private String password = ConfigProperties.getProperty("password");
    private String userName = ConfigProperties.getProperty("userName");

    @Test(description = "open different elements page from home page ")
    public void searchAndCheckPageElements(){

        ex2ActionStep = new Ex2ActionStep(driver);
        ex2AssertionStep = new Ex2AssertionStep(driver);

        ex2ActionStep.openPage(ConfigProperties.getProperty("url"));
        ex2AssertionStep.titleShouldBeRight(TestData.HOME_PAGE_TITLE.getValue());

        ex2ActionStep.login(login, password);
        ex2AssertionStep.userNameShouldBeRight(userName);

        ex2ActionStep.navigateToPageByDiffElBtn(TestData.DIFFERENT_ELEMENTS_TITLE.getValue());

        ex2ActionStep.clickWaterCheckBox();
        ex2ActionStep.clickWindCheckBox();
        ex2ActionStep.selectSelenRadio();
        ex2ActionStep.selectColor(TestData.YELLOW.getValue());

        ex2AssertionStep.waterCheckboxIsSelected();
        ex2AssertionStep.windCheckboxIsSelected();
        ex2AssertionStep.selenRadioIsSelected();
        ex2AssertionStep.yellowColorIsSelected();

        ex2AssertionStep.checkNumberOfLogRows(TestData.LOG_ROWS_NUMBER.getAmount());
        ex2AssertionStep.waterLogRowShouldBeDisplayedAndHaveProperText(TestData.WATER_ROW_TEXT.getValue());
        ex2AssertionStep.windLogRowShouldBeDisplayedAndHaveProperText(TestData.WIND_ROW_TEXT.getValue());
        ex2AssertionStep.selenLogRowShouldBeDisplayedAndHaveProperText(TestData.SELEN_ROW_TEXT.getValue());
        ex2AssertionStep.yellowLogRowShouldBeDisplayedAndHaveProperText(TestData.YELLOW_ROW_TEXT.getValue());
    }
}
