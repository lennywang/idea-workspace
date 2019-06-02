package com.bwj.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName Redis
 * @Description TODO
 * @Author wll
 * @Date 2019/5/4 18:03
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "redis")
@PropertySource("classpath:config/config.properties")
public class Redis {
    private String url;
    private String userName;
    private String password;
    private String driverClass;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }
}
