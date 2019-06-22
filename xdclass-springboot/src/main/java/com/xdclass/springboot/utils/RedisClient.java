package com.xdclass.springboot.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 *
 **/
@Component
public class RedisClient {

    @Autowired
    private StringRedisTemplate redisTemplate;


    /**
     * 设置key-value到redis中
     **/
    public boolean set(String key, String value) {


        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 根据key获取value
     **/
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
