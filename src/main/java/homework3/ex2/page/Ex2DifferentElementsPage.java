package homework3.ex2.page;

import homework3.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Ex2DifferentElementsPage extends BasePage {

    @FindBy(xpath = "//label[contains(. ,'Water')]/input")
    private WebElement waterCheckbox;
    @FindBy(xpath = "//label[contains(. ,'Wind')]/input")
    private WebElement windCheckbox;
    @FindBy(xpath = "//label[contains(. ,'Selen')]/input")
    private WebElement selenRadio;
    @FindBy(className = "colors")
    private WebElement colorMenu;
    @FindBy(xpath = "//option[contains(.,'Yellow')]")
    private WebElement yellowColor;
    @FindBy(css = ".panel-body-list.logs > li")
    private List<WebElement> logRowBlock;

    public Ex2DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public Ex2DifferentElementsPage clickWaterCheckBox() {
        waterCheckbox.click();
        return this;
    }

    public Ex2DifferentElementsPage waterCheckboxIsSelected() {
        elementIsSelected(waterCheckbox);
        return this;
    }

    public Ex2DifferentElementsPage clickWindCheckBox() {
        windCheckbox.click();
        return this;
    }

    public Ex2DifferentElementsPage windCheckboxIsSelected() {
        elementIsSelected(windCheckbox);
        return this;
    }

    public Ex2DifferentElementsPage clickSelenRadio() {
        selenRadio.click();
        return this;
    }

    public Ex2DifferentElementsPage selenRadioIsSelected() {
        elementIsSelected(selenRadio);
        return this;
    }

    public Ex2DifferentElementsPage selectColor(String color) {
        colorMenu.click();
        String xpathExpression = String
                .format("//option[contains(.,'%s')]", color);
        WebElement colorElement = driver.findElement(By.xpath(xpathExpression));
        colorElement.click();
        return this;
    }

    public Ex2DifferentElementsPage yellowColorIsSelected() {
        elementIsSelected(yellowColor);
        return this;
    }

    public Ex2DifferentElementsPage checkNumberOfLogRows(int expectedAmount) {
        elementsHaveProperNumber(logRowBlock, expectedAmount);
        return this;
    }

    public Ex2DifferentElementsPage rowIsDisplayed(String rowText) {
        logRowListHaveElementWithProperText(logRowBlock, rowText);
        return this;
    }


}
