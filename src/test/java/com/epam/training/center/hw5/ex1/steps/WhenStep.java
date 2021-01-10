package com.epam.training.center.hw5.ex1.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class WhenStep extends AbstractStep {

    @When("I login with {string} login and {string} password")
    public void loginAsDefaultUser(String login, String password) {
        homePage.login(login, password);
    }

    @When("I open {string} page via top navigation bar")
    public void navigateToDifferentElementsPage(String pageName) throws InterruptedException {
        homePage.navigateToPageByDiffElBtn(pageName);
    }

    @And("I click on a 'Water' checkbox")
    public void clickWaterCheckBox() {
        differentElementsPage.clickWaterCheckBox();
        differentElementsPage.waterCheckboxIsSelected();
    }

    @And("I click on a 'Wind' checkbox")
    public void clickWindCheckBox() {
        differentElementsPage.clickWindCheckBox();
        differentElementsPage.windCheckboxIsSelected();
    }

    @And("I click on a 'Selen' radio")
    public void clickSelenRadio() {
        differentElementsPage.clickSelenRadio();
        differentElementsPage.selenRadioIsSelected();
    }

    @And("I click on a color dropdown and select {string} color")
    public void selectColor(String color) {
        differentElementsPage.selectColor(color);
        differentElementsPage.yellowColorIsSelected();
    }

    //for exercise 2
    @When("I click on \"Service\" button in Header")
    public void clickServiceBtn() {
        topNavigationBar.getServiceTopNavBtn().click();
    }

    @And("I click on {string} button in Service dropdown")
    public void navigateToUserTableViaTopNav(String pageName) throws InterruptedException {
        homePage.navigateToUserTablePageViaTopNavBar(pageName);
    }

    @When("I select 'vip' checkbox for \"Sergey Ivan\"")
    public void selectVipCheckBoxForIvan() {
        userTablePage.selectVipCheckboxForSergeyIvan();
    }


}
