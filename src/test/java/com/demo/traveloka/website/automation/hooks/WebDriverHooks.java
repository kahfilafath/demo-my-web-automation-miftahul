package com.demo.traveloka.website.automation.hooks;

import com.demo.traveloka.website.automation.driver.WebDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class WebDriverHooks {

    @Autowired
    WebDriverInit webDriverInit;

    @Before()
    public void beforeScenario()  {
        webDriverInit.initialize();
    }

    @After()
    public void afterScenario(){
        webDriverInit.quit();
    }

}
