package com.epam.training.center.hw6;

import com.epam.jdi.light.driver.WebDriverUtils;
import homework6.JdiSite;
import homework6.entity.Data;
import homework6.entity.User;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;


public class JdiHomeAndMetalAndColorsPageTest {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initElements(JdiSite.class);
        JdiSite.openHomePage();
        JdiSite.login(User.Roman);
        String actualUserName = JdiSite.getUserName();
        Assert.assertEquals(actualUserName, User.Roman.getUserName());
    }

    @Test(dataProvider = "jsonData", dataProviderClass = JsonTestDataProvider.class)
    public void testTest(Data data) {

        JdiSite.openMetalsAndColorsPageViaHeaderMenu();
        JdiSite.selectSummaryCheckbox(data);
        JdiSite.selectElements(data);
        JdiSite.selectColor(data);
        JdiSite.selectMetal(data);
        JdiSite.selectVegetable(data);
        JdiSite.clickSubmit();

        JdiSite.resultRowsHaveProperText(data);

    }

    @AfterSuite
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
