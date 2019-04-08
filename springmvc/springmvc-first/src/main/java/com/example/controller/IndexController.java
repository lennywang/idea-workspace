package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author wll
 * @Date 2019/3/21 21:51
 * @Version 1.0
 **/
@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
