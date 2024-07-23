package com.practice.demo;

import com.practice.demo.config.AppConfigData;
import com.practice.demo.config.DBConfigData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(DemoApplication.class, args);
        String str = container.getBean(String.class);
        System.out.println(str);
        AppConfigData appConfigData = container.getBean(AppConfigData.class);
        System.out.println(STR."appConfigData.getUrl() = \{appConfigData.getUrl()}");
        System.out.println(STR."appConfigData.getUserName() = \{appConfigData.getUserName()}");
        System.out.println(STR."appConfigData.getPassword() = \{appConfigData.getPassword()}");

		DBConfigData data = container.getBean(DBConfigData.class);
		System.out.println(STR."data.username = \{data.getUsername()}");
		System.out.println(STR."data.getPassword() = \{data.getPassword()}");
		System.out.println(STR."data.getType() = \{data.getType()}");

	}

    @Bean
    public String str1() {
        return "demoPractice";
    }
}


