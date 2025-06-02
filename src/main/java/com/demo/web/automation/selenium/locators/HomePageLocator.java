package com.demo.web.automation.selenium.locators;

import org.openqa.selenium.By;

public interface HomePageLocator {
    By IMG_ALFAGIFT_LOOGO = By.xpath("//img[@alt='alfagift.id']");
    By LABEL_EXPLORE_ALFAGIFT = By.xpath("//button[contains(@id,'jelajahiAlfagiftDropdown')]");
    By MENU_CATEGORY = By.xpath("//div[contains(@class,'category-btn')]");
    String MENU_CATEGORY_NAME = "//span[text()='%s']";
    String MENU_SUB_CATEGORY_NAME = "//a[text()='%s']";
    String LABEL_HEADER_CATEGORY_PAGE = "//p[text()='%s']";
    By INPUT_SEARCH_PRODUCT = By.xpath("//input[@id='search-input' and not(ancestor-or-self::*[contains(@style,'display:none')])]");
    By BUTTON_SEARCH_PRODUCT = By.xpath("//button[@class='btn btn-secondary']");
    By LABEL_PRODUCT_NAME = By.xpath("//p[contains(@class,'product_name')]");
    By BUTTON_STAY_IN_WEBSITE = By.xpath("//button[@class='bottom-btn-ghost']");

}
