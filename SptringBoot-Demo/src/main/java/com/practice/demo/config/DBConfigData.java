package com.practice.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "db")
public class DBConfigData {


    private String username;
    private String password;
    private List<String> type;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getType() {
        return type;
    }
}
