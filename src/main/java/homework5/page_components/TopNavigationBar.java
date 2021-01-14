package homework5.page_components;

import homework5.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopNavigationBar extends BasePage {

    @FindBy(css = ".m-l8 > li")
    private List<WebElement> topNavBar;
    @FindBy(xpath = "//a[text()='Home']")
    private WebElement homeTopNavBtn;
    @FindBy(xpath = "//a[text()='Contact form']")
    private WebElement contactTopNavBtn;
    @FindBy(xpath = "//a[contains(. ,'Service')]")
    private WebElement serviceTopNavBtn;
    @FindBy(xpath = "//a[text()='Metals & Colors']")
    private WebElement metalAndColorsTopNavBtn;
    @FindBy(xpath = "//a[text()='Different elements']")
    private WebElement differentElementsBtn;
    @FindBy(xpath = "//a[text()='User Table ']")
    private WebElement userTableBtn;


    public TopNavigationBar(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getTopNavBar() {
        return topNavBar;
    }

    public WebElement getHomeTopNavBtn() {
        return homeTopNavBtn;
    }

    public WebElement getContactTopNavBtn() {
        return contactTopNavBtn;
    }

    public WebElement getServiceTopNavBtn() {
        return serviceTopNavBtn;
    }

    public WebElement getMetalAndColorsTopNavBtn() {
        return metalAndColorsTopNavBtn;
    }

    public WebElement getDifferentElementsBtn() {
        return differentElementsBtn;
    }

    public WebElement getUserTableBtn() {
        return userTableBtn;
    }

}
