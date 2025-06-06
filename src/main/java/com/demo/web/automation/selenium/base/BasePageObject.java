package com.demo.web.automation.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.demo.web.automation.selenium.driver.WebDriverInit.driver;

public class BasePageObject {

    public WebDriver getDriver(){return driver;}

    public WebElement find(By locator){
        return getDriver().findElement(locator);
    }

    public List<WebElement> findAlls(By locator){
        return getDriver().findElements(locator);
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
    public Boolean isEnabled(By locator){return find(locator).isEnabled();}

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

    public void hover(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).perform();
    }


}
