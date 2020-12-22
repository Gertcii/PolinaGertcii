package homework3.ex1.page;

import homework3.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Ex1TopNavigationBar extends BasePage {

    @FindBy(css = ".m-l8 > li")
    private List<WebElement> topNavBar;
    @FindBy(css = ".m-l8 > li:nth-child(1)")
    private WebElement homeTopNavBtn;
    @FindBy(css = ".m-l8 > li:nth-child(2)")
    private WebElement contactTopNavBtn;
    @FindBy(css = ".m-l8 > li:nth-child(3)")
    private WebElement serviceTopNavBtn;
    @FindBy(css = ".m-l8 > li:nth-child(4)")
    private WebElement metalAndColorsTopNavBtn;

    public Ex1TopNavigationBar(WebDriver driver) {
        super(driver);
    }

    public Ex1HomePage topNavBtnHaveProperNumberAndAreDisplayed(int expectedAmount) {
        elementsHaveProperNumber(topNavBar, expectedAmount);
        allElementsAreDisplayed(topNavBar);
        return new Ex1HomePage(driver);
    }

    public Ex1HomePage topHomeBtnHasProperText(String expectedText) {
        equalsText(homeTopNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

    public Ex1HomePage topContactBtnHasProperText(String expectedText) {
        equalsText(contactTopNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

    public Ex1HomePage topServiceBtnHasProperText(String expectedText) {
        equalsText(serviceTopNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

    public Ex1HomePage topMetalAndColorsBtnHasProperText(String expectedText) {
        equalsText(metalAndColorsTopNavBtn, expectedText);
        return new Ex1HomePage(driver);
    }

}
