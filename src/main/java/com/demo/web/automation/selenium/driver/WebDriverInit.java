package com.demo.web.automation.selenium.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Configuration
public class WebDriverInit {

    public static WebDriver driver;
    @Value("driver.web.browser")
    private String webBrowser;
    @Value("driver.web.props.arguments.startMaximized")
    private String startMaximized;
    @Value("driver.web.props.arguments.incognito")
    private String incognito;
    @Value("driver.web.props.arguments.disableNotification")
    private String disableNotif;
    @Value("driver.web.props.arguments.disablePopupBlocking")
    private String disablePopup;



    public void initialize(String url)  {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Chrome Options / Capabilities
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.geolocation", 2);

        options.addArguments(this.startMaximized);
        options.addArguments(this.disableNotif);
        options.addArguments(this.incognito);
        options.addArguments(this.disablePopup);
        options.setExperimentalOption("prefs", prefs);
        // options.addArguments("--headless"); // enable for headless mode

        //initialize driver
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Example: open a webpage
        driver.manage().window().maximize();
        driver.get(url);

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
