package com.epam.training.center.hw4.ex2.step;

import com.epam.training.center.hw4.AbstractStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class Ex2ActionStep extends AbstractStep {

    public Ex2ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("login as default user")
    public void login(String login, String password) {
        homePage.login(login, password);
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
