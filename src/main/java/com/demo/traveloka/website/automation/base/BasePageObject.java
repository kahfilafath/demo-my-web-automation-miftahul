package com.demo.traveloka.website.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.demo.traveloka.website.automation.driver.WebDriverInit.driver;

public class BasePageObject {

    public WebDriver getDriver(){return driver;}

    public WebElement find(By locator){
        return getDriver().findElement(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator, String text){
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }
    public String getText(By locator){
        return find(locator).getText();
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void waitUntilPresent(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitUntilTextPresent(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.textToBePresentInElement(find(locator), text));
    }


}
