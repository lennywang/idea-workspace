package com.bwj.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName HelloServiceProperties
 * @Description TODO
 * @Author wll
 * @Date 2019/5/4 19:07
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG="world";

    private String msg =MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
