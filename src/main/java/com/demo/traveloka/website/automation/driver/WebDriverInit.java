package com.demo.traveloka.website.automation.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Component
public class WebDriverInit {

    public static WebDriver driver;

    public void initialize()  {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Chrome Options / Capabilities
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.geolocation", 2);

        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        //options.addArguments("--incognito");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("prefs", prefs);
        // options.addArguments("--headless"); // enable for headless mode

        //initialize driver
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Example: open a webpage
        driver.get("https://alfagift.id");

    }

    public void quit() {
        //delay
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //quit
        driver.quit();
    }


}
