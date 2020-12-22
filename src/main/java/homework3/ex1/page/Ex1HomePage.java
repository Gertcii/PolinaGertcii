package homework3.ex1.page;

import homework3.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Ex1HomePage extends BasePage {

    private WebDriver driver;

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


    @FindBy(className = "benefit-icon")
    private List<WebElement> benefitIcons;
    @FindBy(className = "benefit")
    private List<WebElement> benefitText;
    @FindBy(xpath = "//div[@class = 'benefit']/span[contains(text(),'To include good practices')]")
    private WebElement textBelowIcon1;
    @FindBy(xpath = "//div[@class = 'benefit']/span[contains(text(),'To be flexible and')]")
    private WebElement textBelowIcon2;
    @FindBy(xpath = "//div[@class = 'benefit']/span[contains(text(),'To be multiplatform')]")
    private WebElement textBelowIcon3;
    @FindBy(xpath = "//div[@class = 'benefit']/span[contains(text(),'Already have good base')]")
    private WebElement textBelowIcon4;
    @FindBy(id = "frame")
    private WebElement frameField;
    @FindBy(id = "button-frame")
    private WebElement frameBtn;

    public Ex1HomePage(WebDriver driver) {
        super(driver);
    }

    public Ex1HomePage login(String login, String password) {
        userIcon.click();
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        enterBtn.click();
        return this;
    }

    public Ex1HomePage isRightUserName(String expectedUserName) {
        equalsText(userName, expectedUserName);
        return this;
    }

    public Ex1HomePage allIconsAreDisplayedAndHaveProperAmount(int expectedAmount) {
        elementsHaveProperNumber(benefitIcons, expectedAmount);
        allElementsAreDisplayed(benefitIcons);
        return this;
    }

    public Ex1HomePage allBenefitTextsAreDisplayedAndHaveProperAmount(int expectedAmount) {
        elementsHaveProperNumber(benefitText, expectedAmount);
        allElementsAreDisplayed(benefitText);
        return this;
    }

    public Ex1HomePage textBelowIcon1IsDisplayed() {
        elementIsDisplayed(textBelowIcon1);
        return this;
    }

    public Ex1HomePage textBelowIcon2IsDisplayed() {
        elementIsDisplayed(textBelowIcon2);
        return this;
    }

    public Ex1HomePage textBelowIcon3IsDisplayed() {
        elementIsDisplayed(textBelowIcon3);
        return this;
    }

    public Ex1HomePage textBelowIcon4IsDisplayed() {
        elementIsDisplayed(textBelowIcon4);
        return this;
    }

    public Ex1HomePage frameElementIsDisplayed() {
        elementIsDisplayed(frameField);
        return this;
    }

    public Ex1HomePage switchToFrame(WebDriver driver, String frameId) {
        driver.switchTo().frame(frameId);
        return this;
    }

    public Ex1HomePage frameBtnIsDisplayed() {
        elementIsDisplayed(frameBtn);
        return this;
    }

    public Ex1HomePage switchToOriginalWindow(WebDriver driver) {
        driver.switchTo().defaultContent();
        return this;
    }

}
