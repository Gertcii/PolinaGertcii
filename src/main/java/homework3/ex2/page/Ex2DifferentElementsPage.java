package homework3.ex2.page;

import homework3.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Ex2DifferentElementsPage extends BasePage {

    @FindBy(css = "label:nth-child(1) > input[type=checkbox]")
    private WebElement waterCheckbox;
    @FindBy(css = "label:nth-child(3) > input[type=checkbox]")
    private WebElement windCheckbox;
    @FindBy(css = "label:nth-child(4) > input[type=radio]")
    private WebElement selenRadio;
    @FindBy(className = "colors")
    private WebElement colorMenu;
    @FindBy(css = ".colors > select > option:nth-child(4)")
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

    public Ex2DifferentElementsPage clickColorMenu() {
        colorMenu.click();
        return this;
    }

    public Ex2DifferentElementsPage clickYellowColor() {
        yellowColor.click();
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
