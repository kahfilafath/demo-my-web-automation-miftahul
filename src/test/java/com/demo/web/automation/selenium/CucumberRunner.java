package com.demo.web.automation.selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com/demo/web/automation/selenium"},
        features = {"src/test/resources/features"},
        plugin = {"json:build/cucumber.json", "pretty"},
        stepNotifications = true,
        tags = "",
        publish = true
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void beforeClass() {

    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @AfterClass
    public static void afterClass(){


    }


}
