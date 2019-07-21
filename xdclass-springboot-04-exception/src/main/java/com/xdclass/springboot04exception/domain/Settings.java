package com.xdclass.springboot04exception.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 **/
@Component
@PropertySource({"classpath:application.properties"})
@ConfigurationProperties(prefix = "test")
public class Settings {
    private String name;

    private String domain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
