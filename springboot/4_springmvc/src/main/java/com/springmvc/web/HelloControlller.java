package com.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControlller {
    @RequestMapping("/index")
    public String hello(){
        return  "index";
    }
}
