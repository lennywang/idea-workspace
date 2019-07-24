package com.xdclass.springboot07thymeleaf.ch7_03_freemarker.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 **/
@Component
@PropertySource({"classpath:application.properties"})
@ConfigurationProperties(prefix = "server")
public class ServerSettings {
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
