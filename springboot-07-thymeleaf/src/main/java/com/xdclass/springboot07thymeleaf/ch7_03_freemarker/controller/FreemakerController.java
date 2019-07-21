package com.xdclass.springboot07thymeleaf.ch7_03_freemarker.controller;

import com.xdclass.springboot07thymeleaf.ch7_03_freemarker.domain.Resource;
import com.xdclass.springboot07thymeleaf.ch7_03_freemarker.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 **/
@Controller
@RequestMapping("/api/v1/freemaker")
public class FreemakerController {

    @Autowired
    private ServerSettings serverSettings;

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("setting", serverSettings);
        System.out.println(serverSettings);
        return "views/index";
    }

    @RequestMapping("/")
    public String home(ModelMap map){
        map.addAttribute("resource",resource);
        System.out.println(resource.getLanguage()+":"+resource.getWebsite()+":"+resource.getName());
        return "freemarker/index";
    }
}
