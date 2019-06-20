package com.springcloud.order_service.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @ClassName JsonUtils
 * @Description TODO
 * @Author wll
 * @Date 2019/6/5 5:09
 * @Version 1.0
 **/
public class JsonUtils {

    private static final ObjectMapper objectMapper =new ObjectMapper();

    public static JsonNode str2JsonNode(String string){
        try {
            return objectMapper.readTree(string);
        } catch (IOException e) {
            return null;
        }
    }

}
