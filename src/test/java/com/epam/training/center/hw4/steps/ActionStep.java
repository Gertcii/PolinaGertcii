package com.epam.training.center.hw4.steps;

import com.epam.training.center.hw4.AbstractStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("login as default user")
    public void login(String login, String password) {
        homePage.login(login, password);
    }

    @Step("Switch to frame")
    public void switchToFrame(WebDriver driver, String frameId) {
        homePage.switchToFrame(driver, frameId);
    }

    @Step("switch back to index page")
    public void switchToOriginalWindow(WebDriver driver) {
        homePage.switchToOriginalWindow(driver);
    }

    @Step("navigate to Different Elements page via side-bar menu")
    public void navigateToPageByDiffElBtn(String pageName) {
        homePage.navigateToPageByDiffElBtn(pageName);
    }

    @Step
    public void clickWaterCheckBox() {
        differentElementsPage.clickWaterCheckBox();
    }

    @Step
    public void clickWindCheckBox() {
        differentElementsPage.clickWindCheckBox();
    }

    @Step
    public void selectSelenRadio() {
        differentElementsPage.clickSelenRadio();
    }

    @Step
    public void selectColor(String color) {
        differentElementsPage.selectColor(color);
    }

}
