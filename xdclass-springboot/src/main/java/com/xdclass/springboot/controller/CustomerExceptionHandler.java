package com.xdclass.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;


/**
 *
 **/
@RestControllerAdvice
public class CustomerExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    Object handleExeption(Exception ex, HttpServletRequest request) {
        log.error("url {},msg {}", request.getRequestURL(), ex.getMessage());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("code", 100);
        hashMap.put("msg", ex.getMessage());
        hashMap.put("url", request.getRequestURL());
        return hashMap;
    }

}
