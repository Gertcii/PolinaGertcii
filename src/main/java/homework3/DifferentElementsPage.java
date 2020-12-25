package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DifferentElementsPage extends BasePage {

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

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public DifferentElementsPage clickWaterCheckBox() {
        waterCheckbox.click();
        return this;
    }

    public DifferentElementsPage waterCheckboxIsSelected() {
        elementIsSelected(waterCheckbox);
        return this;
    }

    public DifferentElementsPage clickWindCheckBox() {
        windCheckbox.click();
        return this;
    }

    public DifferentElementsPage windCheckboxIsSelected() {
        elementIsSelected(windCheckbox);
        return this;
    }

    public DifferentElementsPage clickSelenRadio() {
        selenRadio.click();
        return this;
    }

    public DifferentElementsPage selenRadioIsSelected() {
        elementIsSelected(selenRadio);
        return this;
    }

    public DifferentElementsPage selectColor(String color) {
        colorMenu.click();
        String xpathExpression = String
                .format("//option[contains(.,'%s')]", color);
        WebElement colorElement = driver.findElement(By.xpath(xpathExpression));
        colorElement.click();
        return this;
    }

    public DifferentElementsPage yellowColorIsSelected() {
        elementIsSelected(yellowColor);
        return this;
    }

    public DifferentElementsPage checkNumberOfLogRows(int expectedAmount) {
        elementsHaveProperNumber(logRowBlock, expectedAmount);
        return this;
    }

    public DifferentElementsPage rowIsDisplayed(String rowText) {
        logRowListHaveElementWithProperText(logRowBlock, rowText);
        return this;
    }


}
