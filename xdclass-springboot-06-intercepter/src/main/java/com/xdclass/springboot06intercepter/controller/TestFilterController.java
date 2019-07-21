package com.xdclass.springboot06intercepter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 **/
@RestController
public class TestFilterController {

    @RequestMapping("/api/v1/test")
    private Object test(){
        return null;
    }

}
