package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(@RequestParam() String user_name){
        userService.insert(user_name);
        UserEntity userEntity=userService.select(user_name);
        return userEntity.toString();
    }
}
