package com.java.logback;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("Swagger2 and Logback Hello World")
@RestController
@RequestMapping(value = "/demo")
public class HelloController {

    @ApiOperation("Hello")
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "hello";
    }

    @ApiOperation("Hello2")
    @ResponseBody
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String say2(){
        return "hello";
    }
}
