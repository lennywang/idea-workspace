package com.xdclass.springboot09redis.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 *
 **/
//java 泛型详解https://blog.csdn.net/s10461/article/details/53941091
public class JsonUtils {
    private static ObjectMapper objectMapper =new ObjectMapper();

    public static <T> String obj2String(T obj){
        if (obj==null){
            return null;
        }

        try {
            return obj instanceof String ? (String) obj:objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T string2Object(String string,Class<T> clazz)
    {
        if (StringUtils.isEmpty(string) || clazz ==null){
            return null;
        }

        try {
         return    clazz.equals(String.class) ? (T)string:objectMapper.readValue(string,clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
