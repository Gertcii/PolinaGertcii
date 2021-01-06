package com.epam.training.center.hw4.allure_listener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        attachScreenShot(driver);
    }

    private byte[] attachScreenShot(WebDriver driver){

        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
