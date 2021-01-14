package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class UserTablePage extends BasePage {

    @FindBy(css = "tbody > tr")
    List<WebElement> usersInTable;
    @FindBy(css = " td > select")
    List<WebElement> typeDropdowns;
    @FindBy(css = " td > a")
    List<WebElement> userNamesInTable;
    @FindBy(css = ".user-descr")
    List<WebElement> userDescriptionInTable;
    @FindBy(xpath = "//input[@type = 'checkbox']")
    List<WebElement> userCheckboxesInTable;
    @FindBy(id = "ivan")
    WebElement ivanCheckBox;
    @FindBy(className = "panel-body-list logs")
    WebElement logRowBlock;


    public UserTablePage(WebDriver driver) {
        super(driver);
    }

    public UserTablePage numberOfTypeDropdowns(int expectedNumber) {
        elementsHaveProperNumber(typeDropdowns, expectedNumber);
        allElementsAreDisplayed(typeDropdowns);
        return this;
    }

    public UserTablePage numberOfUserNames(int expectedNumber) {
        elementsHaveProperNumber(userNamesInTable, expectedNumber);
        allElementsAreDisplayed(userNamesInTable);
        return this;
    }

    public UserTablePage numberOfDescriptionText(int expectedNumber) {
        elementsHaveProperNumber(userDescriptionInTable, expectedNumber);
        allElementsAreDisplayed(userDescriptionInTable);
        return this;
    }

    public UserTablePage numberOfCheckboxes(int expectedNumber) {
        elementsHaveProperNumber(userCheckboxesInTable, expectedNumber);
        allElementsAreDisplayed(userCheckboxesInTable);
        return this;
    }

    public UserTablePage userTableContent(String number, String user, String description) {

        String numberExpression = "//td[contains(text(),'" + number + "')]";
        String userExpression = "//a[contains(text(),'" + user + "')]";
        String[] descWordList = description.split(" ");
        String descriptionExpression = "//span[contains(. ,'" + descWordList[0] + "')]";
        List<WebElement> tableRow = new ArrayList<>();
        tableRow.add(driver.findElement(By.xpath(numberExpression)));
        tableRow.add(driver.findElement(By.xpath(userExpression)));
        tableRow.add(driver.findElement(By.xpath(descriptionExpression)));
        allElementsAreDisplayed(tableRow);

        return this;
    }

    public UserTablePage selectContentInDropdownRoman(String content) {
        String xpathEpr = "//select/option[contains(. ,'" + content + "')]";
        typeDropdowns.get(0).click();
        elementIsDisplayed(driver.findElement(By.xpath(xpathEpr)));
        return this;
    }

    public UserTablePage selectVipCheckboxForSergeyIvan() {
        ivanCheckBox.click();
        return this;
    }

    public UserTablePage logRowBlockHasProperText(String expectedText) {

        String xpathExpr = "//li[contains(. ,'" + expectedText + "')]";
        return this;
    }

}
