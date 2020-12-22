package homework3.ex2.page;

import homework3.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Ex2LeftNavigationBar extends BasePage {

    public Ex2LeftNavigationBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sidebar-menu > li")
    private List<WebElement> leftNavBar;

    public Ex2HomePage leftNavBtnHaveProperNumberAndAreDisplayed(int expectedAmount) {
        elementsHaveProperNumber(leftNavBar, expectedAmount);
        allElementsAreDisplayed(leftNavBar);
        return new Ex2HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li.active")
    private WebElement leftHomeNavBtn;

    public Ex2HomePage leftHomeNavBtnHaveProperText(String expectedText) {
        equalsText(leftHomeNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(2)")
    private WebElement leftContactNavBtn;

    public Ex2HomePage leftContactNavBtnHaveProperText(String expectedText) {
        equalsText(leftContactNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(3)")
    private WebElement leftServiceNavBtn;

    public Ex2HomePage leftServiceNavBtnHaveProperText(String expectedText) {
        equalsText(leftServiceNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(4)")
    private WebElement leftMetalAndColorsNavBtn;

    public Ex2HomePage leftMetalAndColorsNavBtnHaveProperText(String expectedText) {
        equalsText(leftMetalAndColorsNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    @FindBy(css = ".sidebar-menu > li:nth-child(5)")
    private WebElement leftElementsPackNavBtn;

    public Ex2HomePage leftElementsPackNavBtnHaveProperText(String expectedText) {
        equalsText(leftElementsPackNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }


}
