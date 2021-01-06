package homework4;

import homework3.page_components.LeftNavigationBar;
import homework3.page_components.TopNavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    private LeftNavigationBar leftNavBar = new LeftNavigationBar(driver);
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
    @FindBy(className = "benefit-icon")
    private List<WebElement> benefitIcons;
    @FindBy(className = "benefit")
    private List<WebElement> benefitText;
    @FindBy(xpath = "//span[contains(text(),'To include good practices')]")
    private WebElement textBelowIcon1;
    @FindBy(xpath = "//span[contains(text(),'To be flexible and')]")
    private WebElement textBelowIcon2;
    @FindBy(xpath = "//span[contains(text(),'To be multiplatform')]")
    private WebElement textBelowIcon3;
    @FindBy(xpath = "//span[contains(text(),'Already have good base')]")
    private WebElement textBelowIcon4;
    @FindBy(id = "frame")
    private WebElement frameField;
    @FindBy(id = "button-frame")
    private WebElement frameBtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String login, String password) {
        userIcon.click();
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        enterBtn.click();
        return this;
    }

    public HomePage isRightUserName(String expectedUserName) {
        equalsText(userName, expectedUserName);
        return this;
    }

    public HomePage topNavBtnHaveProperNumberAndAreDisplayed(int expectedAmount) {
        elementsHaveProperNumber(topNavBar.getTopNavBar(), expectedAmount);
        allElementsAreDisplayed(topNavBar.getTopNavBar());
        return this;
    }

    public HomePage topHomeBtnHasProperText(String expectedText) {
        equalsText(topNavBar.getHomeTopNavBtn(), expectedText);
        return this;
    }

    public HomePage topContactBtnHasProperText(String expectedText) {
        equalsText(topNavBar.getContactTopNavBtn(), expectedText);
        return this;
    }

    public HomePage topServiceBtnHasProperText(String expectedText) {
        equalsText(topNavBar.getServiceTopNavBtn(), expectedText);
        return this;
    }

    public HomePage topMetalAndColorsBtnHasProperText(String expectedText) {
        equalsText(topNavBar.getMetalAndColorsTopNavBtn(), expectedText);
        return this;
    }

    public HomePage allIconsAreDisplayedAndHaveProperAmount(int expectedAmount) {
        elementsHaveProperNumber(benefitIcons, expectedAmount);
        allElementsAreDisplayed(benefitIcons);
        return this;
    }

    public HomePage allBenefitTextsAreDisplayedAndHaveProperAmount(int expectedAmount) {
        elementsHaveProperNumber(benefitText, expectedAmount);
        allElementsAreDisplayed(benefitText);
        return this;
    }

    public HomePage textBelowIcon1IsDisplayed() {
        elementIsDisplayed(textBelowIcon1);
        return this;
    }

    public HomePage textBelowIcon2IsDisplayed() {
        elementIsDisplayed(textBelowIcon2);
        return this;
    }

    public HomePage textBelowIcon3IsDisplayed() {
        elementIsDisplayed(textBelowIcon3);
        return this;
    }

    public HomePage textBelowIcon4IsDisplayed() {
        elementIsDisplayed(textBelowIcon4);
        return this;
    }

    public HomePage frameElementIsDisplayed() {
        elementIsDisplayed(frameField);
        return this;
    }

    public HomePage switchToFrame(WebDriver driver, String frameId) {
        driver.switchTo().frame(frameId);
        return this;
    }

    public HomePage frameBtnIsDisplayed() {
        elementIsDisplayed(frameBtn);
        return this;
    }

    public HomePage switchToOriginalWindow(WebDriver driver) {
        driver.switchTo().defaultContent();
        return this;
    }

    public HomePage leftNavBtnHaveProperNumberAndAreDisplayed(int expectedAmount) {
        elementsHaveProperNumber(leftNavBar.getLeftNavBar(), expectedAmount);
        allElementsAreDisplayed(leftNavBar.getLeftNavBar());
        return this;
    }

    public HomePage leftHomeNavBtnHaveProperText(String expectedText) {
        equalsText(leftNavBar.getLeftHomeNavBtn(), expectedText);
        return this;
    }

    public HomePage leftContactNavBtnHaveProperText(String expectedText) {
        equalsText(leftNavBar.getLeftContactNavBtn(), expectedText);
        return this;
    }

    public HomePage leftServiceNavBtnHaveProperText(String expectedText) {
        equalsText(leftNavBar.getLeftServiceNavBtn(), expectedText);
        return this;
    }

    public HomePage leftMetalAndColorsNavBtnHaveProperText(String expectedText) {
        equalsText(leftNavBar.getLeftMetalAndColorsNavBtn(), expectedText);
        return this;
    }

    public HomePage leftElementsPackNavBtnHaveProperText(String expectedText) {
        equalsText(leftNavBar.getLeftElementsPackNavBtn(), expectedText);
        return this;
    }

    public DifferentElementsPage navigateToPageByDiffElBtn(String pageName) {
        navigateToPageViaTopServiceMenu(topNavBar.getServiceTopNavBtn(),
                topNavBar.getDifferentElementsBtn(), pageName);
        return new DifferentElementsPage(driver);
    }
}
