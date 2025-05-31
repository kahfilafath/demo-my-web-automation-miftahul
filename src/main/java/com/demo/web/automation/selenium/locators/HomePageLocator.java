package com.demo.web.automation.selenium.locators;

import org.openqa.selenium.By;

public interface HomePageLocator {
    By IMG_ALFAGIFT_LOOGO = By.xpath("//img[@alt='alfagift.id']");
    By LABEL_EXPLORE_ALFAGIFT = By.xpath("//button[contains(@id,'jelajahiAlfagiftDropdown')]");
    By MENU_CATEGORY = By.xpath("//div[contains(@class,'category-btn')]");
    String MENU_CATEGORY_NAME = "//span[text()='%s']";
    String MENU_SUB_CATEGORY_NAME = "//a[text()='%s']";
    String LABEL_HEADER_CATEGORY_PAGE = "//p[text()='%s']";

}
