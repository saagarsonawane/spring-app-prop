package com.study.springappprop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
public class UserConfig {
    @Autowired
    Environment environment;

    public String getCustomMessage(){
        return environment.getProperty("custom-message");
    }
}
