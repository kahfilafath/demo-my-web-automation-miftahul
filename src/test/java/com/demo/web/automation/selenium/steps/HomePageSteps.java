package com.demo.web.automation.selenium.steps;

import com.demo.web.automation.selenium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePageSteps {
    @Autowired
    HomePage homePage;

    @Given("user land to alfagift website")
    public void userLandToAlfagiftWebsite() {
        Assert.assertTrue(homePage.isLogoDisplayed());

    }

    @Then("user should see {string} on Home Page")
    public void userShouldSeeOnHomePage(String text) {
        Assert.assertEquals(text,homePage.getAlfagiftLabel());
    }

    @And("user click button explore on Home Page")
    public void userClickButtonExploreOnHomePage() {
        homePage.clickExploreMenu();
    }

    @Then("user click category menu on Home Page")
    public void userClickCategoryMenuOnHomePage() {
        homePage.clickCategoryMenu();
    }

    @When("user select category {string} on Home Page")
    public void userClickCategoryOnHomePage(String category) {
        homePage.hoverCategoryName(category);
    }

    @And("user select sub category {string} on Home Page")
    public void userClickSubCategoryOnHomePage(String subCategory) {
        homePage.hoverSubCategoryName(subCategory);
    }

    @Then("user successfully navigate to {string} on Home Page")
    public void userSuccessfullyNavigateToOnHomePage(String header) {
        Assert.assertEquals(header,homePage.getHeaderCategory(header));
    }

    @When("user search product {string} on Home Page")
    public void userSearchProductOnHomePage(String productName) throws InterruptedException {
        homePage.inputProductName(productName);
        homePage.clickSearchProductButton();
    }

    @Then("user should discover product contains {string} on Home Page")
    public void userShouldDiscoverProductContainsOnHomePage(String name) {
        Assertions.assertEquals(name,homePage.getProductName());
    }
}
