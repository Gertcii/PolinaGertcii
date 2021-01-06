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
public class FailTest extends BaseTest {

    private String url = ConfigProperties.getProperty("url");
    private String login = ConfigProperties.getProperty("login");
    private String password = ConfigProperties.getProperty("password");
    private String userName = ConfigProperties.getProperty("userName");

    @Test
    public void searchAndCheckPageElements() {

        ex2ActionStep = new Ex2ActionStep(driver);
        ex2AssertionStep = new Ex2AssertionStep(driver);

        ex2ActionStep.openPage(ConfigProperties.getProperty("url"));
        ex2AssertionStep.titleShouldBeRight(TestData.HOME_PAGE_TITLE.getValue());

        ex2ActionStep.login(login, password);
        ex2AssertionStep.userNameShouldBeRight(userName);

        ex2ActionStep.navigateToPageByDiffElBtn(TestData.DIFFERENT_ELEMENTS_TITLE.getValue());

        ex2AssertionStep.waterCheckboxIsSelected();


    }
}
