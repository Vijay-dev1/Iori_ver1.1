package com.pbl.testing.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonWrapper {

    public WebDriver  driver;
    public static WebDriverWait wait;

    //Constructor
    public CommonWrapper(TestBase base) {
        this.driver = base.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    //Click Method
    public static void click(By by) {
        waitVisibility(by).click();
    }

    //Write Text
    public void writeText(By by, String text) {
        waitVisibility(by).sendKeys(text);
    }

    //Read Text
    public String readText(By by) {
        return waitVisibility(by).getText();
    }

    //Wait
    public static WebElement waitVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
