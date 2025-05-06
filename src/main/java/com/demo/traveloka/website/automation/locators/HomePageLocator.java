package com.demo.traveloka.website.automation.locators;

import org.openqa.selenium.By;

public interface HomePageLocator {
    By IMG_ALFAGIFT_LOOGO = By.xpath("//img[@alt='alfagift.id']");
    By LABEL_EXPLORE_ALFAGIFT = By.xpath("//button[contains(@id,'jelajahiAlfagiftDropdown')]");
    By MENU_CATEGORY = By.xpath("//div[contains(@class,'category-btn')]");
}
