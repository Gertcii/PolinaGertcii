package com.epam.training.center.hw4;

import homework4.DifferentElementsPage;
import homework4.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected HomePage homePage;
    protected DifferentElementsPage differentElementsPage;

    public AbstractStep(WebDriver driver){

        homePage = new HomePage(driver);
        differentElementsPage = new DifferentElementsPage(driver);

    }

    @Step("open home page")
    public void openPage(String url){
        homePage.openPage(url);
    }

}
