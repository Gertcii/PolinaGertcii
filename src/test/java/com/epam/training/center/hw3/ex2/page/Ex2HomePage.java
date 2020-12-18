package com.epam.training.center.hw3.ex2.page;

import com.epam.training.center.hw3.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ex2HomePage extends BaseTest {

    private WebDriver driver;

    public Ex2HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "user-icon")
    private WebElement userIcon;
    @FindBy(id = "name")
    private WebElement loginField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement enterBtn;
    @FindBy(id = "user-name")
    private WebElement userName;

    public Ex2HomePage login(String login, String password) {
        userIcon.click();
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        enterBtn.click();
        return this;
    }

    public Ex2HomePage isRightUserName(String expectedUserName) {
        equalsText(userName, expectedUserName);
        return this;
    }

}
