package com.epam.training.center.hw5.ex1.steps;

import homework5.DifferentElementsPage;
import homework5.HomePage;
import homework5.UserTablePage;
import homework5.driver.WebDriverSingleton;
import homework5.page_components.TopNavigationBar;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected HomePage homePage;
    protected DifferentElementsPage differentElementsPage;
    protected TopNavigationBar topNavigationBar;
    protected UserTablePage userTablePage;

    public AbstractStep() {
        WebDriver driver = WebDriverSingleton.getDriver();
        homePage = new HomePage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
        topNavigationBar = new TopNavigationBar(driver);
        userTablePage = new UserTablePage(driver);

    }
}
