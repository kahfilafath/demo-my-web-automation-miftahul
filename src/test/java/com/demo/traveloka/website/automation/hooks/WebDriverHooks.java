package com.demo.traveloka.website.automation.hooks;

import com.demo.traveloka.website.automation.driver.WebDriverInit;
import com.demo.traveloka.website.automation.properties.WebProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class WebDriverHooks {

    @Autowired
    WebDriverInit webDriverInit;
    @Autowired
    WebProperties webProperties;

    @Before()
    public void beforeScenario()  {
        webDriverInit.initialize(webProperties.getBaseUrl());
    }

    @After()
    public void afterScenario(){
        webDriverInit.quit();
    }

}
