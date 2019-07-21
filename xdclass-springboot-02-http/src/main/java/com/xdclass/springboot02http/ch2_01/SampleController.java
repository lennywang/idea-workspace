package com.xdclass.springboot02http.ch2_01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 **/
@RestController
public class SampleController {

    @RequestMapping("/")
    String index(){
        return "hello";
    }

    @RequestMapping("/test")
    Map<String,String> testMap(){
        Map<String,String> map =new HashMap<String, String>();
        map.put("name","xdclass");
        return map;
    }
}
