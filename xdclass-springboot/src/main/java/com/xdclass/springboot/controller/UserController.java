package com.xdclass.springboot.controller;

import com.xdclass.springboot.domain.JsonData;
import com.xdclass.springboot.domain.User;
import com.xdclass.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public Object add() {
        User user = new User();
        user.setName("王路路");
        user.setPhone("18516800306");
        user.setDatetime(new Date());
        user.setAge(30);
        int id = userService.add(user);

        return JsonData.buildSuccess(id);
    }
}
