package com.xdclass.springboot09redis;

import com.xdclass.springboot09redis.domain.JsonData;
import com.xdclass.springboot09redis.domain.User;
import com.xdclass.springboot09redis.utils.JsonUtils;
import com.xdclass.springboot09redis.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value = "add")
    public Object add(){
        redisClient.set("username","wll");
        return JsonData.buildSuccess();
    }

    @GetMapping(value = "get")
    public Object get(){
        String username = redisClient.get("username");
        return JsonData.buildSuccess(username);
    }

    @GetMapping(value = "save_user")
    public Object saveUser(){
        User user = new User(1, "abc", "111", new Date());
        String userString= JsonUtils.obj2String(user);
        boolean flag = redisClient.set("base:user:11", userString);
        return JsonData.buildSuccess(flag);
    }

    @GetMapping(value = "find_user")
    public Object findUser(){
        String userString = redisClient.get("base:user:11");
        User user = JsonUtils.string2Object(userString, User.class);
        return JsonData.buildSuccess(user);
    }
}
