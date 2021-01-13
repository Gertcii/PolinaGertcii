package homework4.page_components;

import homework4.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeftNavigationBar extends BasePage {

    @FindBy(css = ".sidebar-menu > li")
    private List<WebElement> leftNavBar;
    @FindBy(xpath = "//li//span[text()='Home']")
    private WebElement leftHomeNavBtn;
    @FindBy(xpath = "//li//span[text()='Contact form']")
    private WebElement leftContactNavBtn;
    @FindBy(xpath = "//li//span[text()='Service']")
    private WebElement leftServiceNavBtn;
    @FindBy(xpath = "//li//span[text()='Metals & Colors']")
    private WebElement leftMetalAndColorsNavBtn;
    @FindBy(xpath = "//li//span[text()='Elements packs']")
    private WebElement leftElementsPackNavBtn;

    public LeftNavigationBar(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getLeftNavBar() {
        return leftNavBar;
    }

    public WebElement getLeftContactNavBtn() {
        return leftContactNavBtn;
    }

    public WebElement getLeftHomeNavBtn() {
        return leftHomeNavBtn;
    }

    public WebElement getLeftServiceNavBtn() {
        return leftServiceNavBtn;
    }

    public WebElement getLeftMetalAndColorsNavBtn() {
        return leftMetalAndColorsNavBtn;
    }

    public WebElement getLeftElementsPackNavBtn() {
        return leftElementsPackNavBtn;
    }

}
