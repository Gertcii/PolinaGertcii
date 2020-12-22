package homework3.ex2.page;

import homework3.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Ex2TopNavigationBar extends BasePage {

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
    @FindBy(css = ".dropdown-menu > li:nth-child(8)")
    private WebElement differentElementsBtn;

    public Ex2TopNavigationBar(WebDriver driver) {
        super(driver);
    }

    public Ex2HomePage topNavBtnHaveProperNumberAndAreDisplayed(int expectedAmount) {
        elementsHaveProperNumber(topNavBar, expectedAmount);
        allElementsAreDisplayed(topNavBar);
        return new Ex2HomePage(driver);
    }

    public Ex2HomePage topHomeBtnHasProperText(String expectedText) {
        equalsText(homeTopNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    public Ex2HomePage topContactBtnHasProperText(String expectedText) {
        equalsText(contactTopNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    public Ex2HomePage topServiceBtnHasProperText(String expectedText) {
        equalsText(serviceTopNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    public Ex2HomePage topMetalAndColorsBtnHasProperText(String expectedText) {
        equalsText(metalAndColorsTopNavBtn, expectedText);
        return new Ex2HomePage(driver);
    }

    public Ex2DifferentElementsPage navigateToPageByDiffElBtn(String pageName) {
        navigateToPageViaTopServiceMenu(serviceTopNavBtn, differentElementsBtn, pageName);
        return new Ex2DifferentElementsPage(driver);
    }

}
