package com.xdclass.springboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xdclass.springboot.domain.JsonData;
import com.xdclass.springboot.domain.User;
import com.xdclass.springboot.utils.JsonUtil;
import com.xdclass.springboot.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedisClient redisClient;

    @GetMapping("/set")
    private Object set() {

        redisClient.set("username","王路路");
        //redisTemplate.opsForValue().set("name","王路路");

        return JsonData.buildSuccess();
    }

    @GetMapping("/get")
    private Object get(){
        String value=redisClient.get("username");
       //String value= redisTemplate.opsForValue().get("name");

        return JsonData.buildSuccess(value);
    }

    @GetMapping("/setuser")
    private Object setUser(){
        User user =new User(1,"王路路","18516800306",new Date(),30);
        String string= JsonUtil.obj2String(user);
       boolean flag= redisClient.set("springboot:user:1",string);
       return JsonData.buildSuccess(flag);
    }

    @GetMapping("/getuser")
    private Object getUser(){
        String key="springboot:user:1";
        String userString=redisClient.get(key);
        User user=JsonUtil.string2Obj(userString,User.class);

        return JsonData.buildSuccess(user);
    }

}
