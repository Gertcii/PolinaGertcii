package com.epam.training.center.hw3.ex1.page;

import com.epam.training.center.hw3.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Ex1LeftNavigationBar extends BaseTest {

    public Ex1LeftNavigationBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sidebar-menu > li")
    private List<WebElement> leftNavBar;

    public Ex1HomePage leftNavBtnHaveProperNumberAndAreDisplayed(int expectedAmount) {
        elementsHaveProperNumber(leftNavBar, expectedAmount);
        allElementsAreDisplayed(leftNavBar);
        return new Ex1HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li.active")
    private WebElement leftHomeNavBtn;

    public Ex1HomePage leftHomeNavBtnHaveProperText(String expectedText) {
        equalsText(leftHomeNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(2)")
    private WebElement leftContactNavBtn;

    public Ex1HomePage leftContactNavBtnHaveProperText(String expectedText) {
        equalsText(leftContactNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(3)")
    private WebElement leftServiceNavBtn;

    public Ex1HomePage leftServiceNavBtnHaveProperText(String expectedText) {
        equalsText(leftServiceNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(4)")
    private WebElement leftMetalAndColorsNavBtn;

    public Ex1HomePage leftMetalAndColorsNavBtnHaveProperText(String expectedText) {
        equalsText(leftMetalAndColorsNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(5)")
    private WebElement leftElementsPackNavBtn;

    public Ex1HomePage leftElementsPackNavBtnHaveProperText(String expectedText) {
        equalsText(leftElementsPackNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }


}
