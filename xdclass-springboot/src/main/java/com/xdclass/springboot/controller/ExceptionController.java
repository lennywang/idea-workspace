package com.xdclass.springboot.controller;

import com.xdclass.springboot.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/")
public class ExceptionController {

    @RequestMapping("/test_exception")
    public Object index(){
        int i=1/0;
        return new User(1,"王路路","18516800306",new Date(),30);
    }

}
