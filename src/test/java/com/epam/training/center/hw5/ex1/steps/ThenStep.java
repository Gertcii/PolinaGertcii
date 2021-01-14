package com.epam.training.center.hw5.ex1.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class ThenStep extends AbstractStep {

    @Then("Page title is {string}")
    public void assertPageTitle(String title) {
        homePage.checkTheTitle(title);
    }

    @Then("User name is {string}")
    public void assertUserName(String userName) {
        homePage.isRightUserName(userName);
    }

    @Then("{int} log rows is displayed")
    public void chekNumberOfLogRows(int expectedNumber) {
        differentElementsPage.checkNumberOfLogRows(expectedNumber);
    }

    @Then("{string} log row for water is displayed")
    public void waterRowHasProperText(String text) {
        differentElementsPage.rowIsDisplayed(text);
    }

    @Then("{string} log row for wind is displayed")
    public void windRowHasProperText(String text) {
        differentElementsPage.rowIsDisplayed(text);
    }

    @Then("{string} log row for selen is displayed")
    public void selenRowHasProperText(String text) {
        differentElementsPage.rowIsDisplayed(text);
    }

    @Then("{string} log row for yellow color is displayed")
    public void yellowRowHasProperText(String text) {
        differentElementsPage.rowIsDisplayed(text);
    }

    @Then("{string} page should be opened")
    public void userTableIsOpened(String pageName) {
        userTablePage.checkTheTitle(pageName);
    }

    @And("{int} Number Type Dropdowns should be displayed on Users Table on User Table Page")
    public void checkTypeDropdownsAmount(int expectedNumber) {
        userTablePage.numberOfTypeDropdowns(expectedNumber);
    }

    @And("{int} Usernames should be displayed on Users Table on User Table Page")
    public void checkUserNamesAmount(int expectedNumber) {
        userTablePage.numberOfUserNames(expectedNumber);
    }

    @And("{int} Description texts under images should be displayed on Users Table on User Table Page")
    public void checkUserDescriptionAmount(int expectedNumber) {
        userTablePage.numberOfDescriptionText(expectedNumber);
    }

    @And("{int} checkboxes should be displayed on Users Table on User Table Page")
    public void checkCheckboxesAmount(int expectedNumber) {
        userTablePage.numberOfCheckboxes(expectedNumber);
    }

    @And("User table should contain following values:")
    public void tableShouldContainValues(DataTable table) {
        List<List<String>> data = table.cells();

        for (int i = 1; i < data.size(); i++) {
            userTablePage.userTableContent(data.get(i).get(0),
                    data.get(i).get(1), data.get(i).get(2));
        }
    }

    @And("droplist should contain values in column Type for user Roman")
    public void dropdownShouldHaveValue(DataTable table) {
        List<String> list = table.asList();
        for (int i = 1; i < list.size(); i++) {
            userTablePage.selectContentInDropdownRoman(list.get(i));
        }
    }

    @Then("1 log row has {string} text in log section")
    public void logRowHasProperTextInLogSection(String text) {
        userTablePage.logRowBlockHasProperText(text);
    }


}
