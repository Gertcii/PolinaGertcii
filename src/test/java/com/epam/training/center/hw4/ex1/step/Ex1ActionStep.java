package com.epam.training.center.hw4.ex1.step;

import com.epam.training.center.hw4.AbstractStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Ex1ActionStep extends AbstractStep {

    public Ex1ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("login as default user")
    public void login (String login, String password){
        homePage.login(login, password);
    }

    @Step("Switch to frame")
    public void switchToFrame(WebDriver driver,  String frameId){
        homePage.switchToFrame(driver, frameId);
    }

    @Step("switch back to index page")
    public void switchToOriginalWindow(WebDriver driver){
        homePage.switchToOriginalWindow(driver);
    }

}
