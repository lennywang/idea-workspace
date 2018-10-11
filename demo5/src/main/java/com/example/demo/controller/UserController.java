package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UserService;

@RestController
@Api(value = "用户服务信息查询",description = "HelloWorldController信息")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ApiOperation(value = "sayHello信息查询")
    public String test(@RequestParam() String user_name){
        userService.insert(user_name);
        UserEntity userEntity=userService.select(user_name);
        return userEntity.toString();
    }
}
