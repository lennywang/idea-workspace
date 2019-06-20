package com.xdclass.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 **/
@RestController
@RequestMapping(value = "/api/v1/demo")
public class Demo {

    @Value("${website.url}")
    private String url;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/url")
    public String getUrl() {
        String string = "网址是：" + url;
        System.out.println(string);

        return string + "aaa";
    }

    @RequestMapping("/port")
    public String getPort() {
        String string = "端口：" + port;
        string = string + "aaa";
        return string;
    }

    @RequestMapping("/const")
    public String getConst() {
        String string = "常数：" + "1";
        return string;
    }
}
