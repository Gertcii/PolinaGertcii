package homework3.ex2.page;

import homework3.BasePage;
import homework3.page_components.TopNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ex2HomePage extends BasePage {

    private TopNavigationBar topNavBar = new TopNavigationBar(driver);

    @FindBy(id = "user-icon")
    private WebElement userIcon;
    @FindBy(id = "name")
    private WebElement loginField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement enterBtn;
    @FindBy(id = "user-name")
    private WebElement userName;

    public Ex2HomePage(WebDriver driver) {
        super(driver);
    }

    public Ex2HomePage login(String login, String password) {
        userIcon.click();
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        enterBtn.click();
        return this;
    }

    public Ex2HomePage isRightUserName(String expectedUserName) {
        equalsText(userName, expectedUserName);
        return this;
    }

    public Ex2DifferentElementsPage navigateToPageByDiffElBtn(String pageName) {
        navigateToPageViaTopServiceMenu(topNavBar.getServiceTopNavBtn(),
                topNavBar.getDifferentElementsBtn(), pageName);
        return new Ex2DifferentElementsPage(driver);
    }

}
