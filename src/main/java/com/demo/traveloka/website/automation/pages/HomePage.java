package com.demo.traveloka.website.automation.pages;

import com.demo.traveloka.website.automation.base.BasePageObject;
import org.springframework.stereotype.Component;

import static com.demo.traveloka.website.automation.locators.HomePageLocator.*;

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

}
