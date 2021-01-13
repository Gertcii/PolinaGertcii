package com.epam.training.center.hw4.ex2.test;

import com.epam.training.center.hw4.BaseTest;
import com.epam.training.center.hw4.ConfigProperties;
import com.epam.training.center.hw4.TestData;
import com.epam.training.center.hw4.steps.ActionStep;
import com.epam.training.center.hw4.steps.AssertionStep;
import org.testng.annotations.Test;

public class FailTest extends BaseTest {

    @Test
    public void searchAndCheckPageElements() {

        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);

        actionStep.openPage(ConfigProperties.getProperty("url"));
        assertionStep.titleShouldBeRight(TestData.HOME_PAGE_TITLE.getValue());

        actionStep.login(login, password);
        assertionStep.userNameShouldBeRight(userName);

        actionStep.navigateToPageByDiffElBtn(TestData.DIFFERENT_ELEMENTS_TITLE.getValue());

        assertionStep.waterCheckboxIsSelected();

    }
}
