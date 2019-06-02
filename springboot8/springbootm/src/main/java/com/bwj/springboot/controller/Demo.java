package com.bwj.springboot.controller;

import com.bwj.springboot.model.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author wll
 * @Date 2019/5/4 15:47
 * @Version 1.0
 **/
@RestController
public class Demo {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Redis redis;

    @RequestMapping("/")
    public String index(){
        return "hello,springboot!";
    }

    @RequestMapping("/getBook")
    String book(){
        return "book aurhor:"+bookAuthor+" ,book name:"+bookName;
    }

    @RequestMapping("/getRedisConfig")
    String getRedisConfig(){
        return "redis url:"+redis.getUrl()+" ,username:"+redis.getUserName()+" ,password:"+redis.getPassword()+" ,driverclass:"+redis.getDriverClass();
    }
}
