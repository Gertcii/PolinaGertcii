package com.epam.training.center.hw5.ex1.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open JDI GitHub site")
    public void openPage() {
        homePage.openPage();
    }

    @And("I login as user {string}")
    public void login(String userName) {
        homePage.login("Roman", "Jdi1234");
        homePage.isRightUserName(userName);
    }

}
