package com.demo.web.automation.selenium.pages;

import com.demo.web.automation.selenium.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.stereotype.Component;
import static com.demo.web.automation.selenium.driver.WebDriverInit.driver;
import static com.demo.web.automation.selenium.locators.HomePageLocator.*;

@Component
public class HomePage extends BasePageObject {

    public Boolean isLogoDisplayed(){
        try {
            return isDisplayed(IMG_ALFAGIFT_LOOGO);
        }catch (Exception e){
            return false;
        }
    }
    public String getAlfagiftLabel(){
        waitUntilPresent(LABEL_EXPLORE_ALFAGIFT);
        return getText(LABEL_EXPLORE_ALFAGIFT);
    }
    public void clickExploreMenu(){
        click(LABEL_EXPLORE_ALFAGIFT);
    }
    public void clickCategoryMenu(){
        click(MENU_CATEGORY);
    }
    public void hoverCategoryName(String category){
        hover(By.xpath(String.format(MENU_CATEGORY_NAME,category)));
    }
    public void hoverSubCategoryName(String subCategory){
        hover(By.xpath(String.format(MENU_SUB_CATEGORY_NAME,subCategory)));
        click(By.xpath(String.format(MENU_SUB_CATEGORY_NAME,subCategory)));
    }
    public String getHeaderCategory(String category){
        return getText(By.xpath(String.format(LABEL_HEADER_CATEGORY_PAGE,category)));
    }
    public void inputProductName(String name) throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = '"+name+"';" +
                        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
                find(INPUT_SEARCH_PRODUCT)
        );
    }
    public void clickSearchProductButton() throws InterruptedException {
        //click(BUTTON_SEARCH_PRODUCT);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", find(BUTTON_SEARCH_PRODUCT));
        Thread.sleep(1000);

    }
    public String getProductName(){

        //return getText(LABEL_PRODUCT_NAME);
        return (String) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].innerText;", find(LABEL_PRODUCT_NAME));

    }

}
