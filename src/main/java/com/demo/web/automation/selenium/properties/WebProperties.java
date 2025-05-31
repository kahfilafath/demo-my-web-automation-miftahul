package com.demo.web.automation.selenium.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@EnableConfigurationProperties({
        WebProperties.class
})
@ConfigurationProperties(prefix = "web")
public class WebProperties {
    private String baseUrl;
}
