package com.demo.traveloka.website.automation.steps;

import com.demo.traveloka.website.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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
}
