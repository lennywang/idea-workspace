package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("Test")
public class Test {

    @RequestMapping("Say")
    public String Say()
    {
        System.out.println("Hi");
        return  "aaa";
    }
}
