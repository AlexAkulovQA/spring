package com.practice.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfigData {
    @Value("${userName}")
    private String userName;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
