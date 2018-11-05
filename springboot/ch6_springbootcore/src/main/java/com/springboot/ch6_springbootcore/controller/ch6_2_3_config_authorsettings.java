package com.springboot.ch6_springbootcore.controller;

import com.springboot.ch6_springbootcore.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ch6_2_3_config_authorsettings {

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/springbootcore/configauthor")
    public String configAuthorSetting(){
        // TODO: 测试TODO
        return "author name is "+authorSettings.getName()+", author age is "+ authorSettings.getAge();
    }
}
