package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public abstract class BasePage {

    private final String url = "https://jdi-testing.github.io/jdi-light/index.html ";
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(url);

    }

    public void checkTheTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }

    public void elementIsDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    public void elementsHaveProperNumber(List<WebElement> elementList, int expectedAmount) {
        Assert.assertEquals(elementList.size(), expectedAmount);
    }

    public void allElementsAreDisplayed(List<WebElement> elementList) {

        boolean result = elementList.stream().anyMatch(element -> !element.isDisplayed());
        Assert.assertFalse(result);
    }

    public void equalsText(WebElement element, String expectedText) {
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void navigateToPageViaTopServiceMenu(WebElement serviceMenu, WebElement dropdownElement, String pageName)  {
        serviceMenu.click();
        dropdownElement.click();
        Assert.assertEquals(driver.getTitle(), pageName);
    }

    public void elementIsSelected(WebElement element) {
        Assert.assertTrue(element.isSelected());
    }

    public void logRowListHaveElementWithProperText(List<WebElement> elementList, String expectedText) {
        String xpathExpression = String
                .format("//li[contains(text(),'%s')]", expectedText);
        Assert.assertTrue(searchElement(By.xpath(xpathExpression)).isDisplayed());
    }

    public WebElement searchElement(By by) {
        return driver.findElement(by);
    }
}
