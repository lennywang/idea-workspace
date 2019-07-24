package com.xdclass.springboot07thymeleaf.ch7_03_freemarker.controller;

import com.xdclass.springboot07thymeleaf.ch7_03_freemarker.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 **/
@Controller
@RequestMapping("/api/v1/thymeleaf")
public class ThymeleafController {

    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("user/index")
    public String userindex(ModelMap map){
        map.addAttribute("setting",serverSettings);
        return "thymeleaf/user/index";
    }

    @RequestMapping("/index")
    private String index(ModelMap modelMap){
        modelMap.addAttribute("setting",serverSettings);
        System.out.println(serverSettings);
        return "thymeleaf/index";
    }

}
