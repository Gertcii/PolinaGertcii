package com.epam.training.center.hw4.ex2.test;

import com.epam.training.center.hw4.BaseTest;
import com.epam.training.center.hw4.TestData;
import org.testng.annotations.Test;


public class HomeAndDifferentElementsPageTest extends BaseTest {

    @Test(description = "open different elements page from home page ")
    public void searchAndCheckPageElements() {

        actionStep.navigateToPageByDiffElBtn(TestData.DIFFERENT_ELEMENTS_TITLE.getValue());

        actionStep.clickWaterCheckBox();
        actionStep.clickWindCheckBox();
        actionStep.selectSelenRadio();
        actionStep.selectColor(TestData.YELLOW.getValue());

        assertionStep.waterCheckboxIsSelected();
        assertionStep.windCheckboxIsSelected();
        assertionStep.selenRadioIsSelected();
        assertionStep.yellowColorIsSelected();

        assertionStep.checkNumberOfLogRows(TestData.LOG_ROWS_NUMBER.getAmount());
        assertionStep.waterLogRowShouldBeDisplayedAndHaveProperText(TestData.WATER_ROW_TEXT.getValue());
        assertionStep.windLogRowShouldBeDisplayedAndHaveProperText(TestData.WIND_ROW_TEXT.getValue());
        assertionStep.selenLogRowShouldBeDisplayedAndHaveProperText(TestData.SELEN_ROW_TEXT.getValue());
        assertionStep.yellowLogRowShouldBeDisplayedAndHaveProperText(TestData.YELLOW_ROW_TEXT.getValue());
    }
}
