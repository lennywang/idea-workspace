package com.xdclass.springboot09redis.utils;

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


    public boolean set(String key, String value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    public String get(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
