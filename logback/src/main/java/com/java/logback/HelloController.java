package com.java.logback;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Swagger2 and Logback Hello World", description = "HelloController信息")
@RestController
@RequestMapping(value = "/api/v1")
public class HelloController {

    @ApiOperation("Hello信息查询")
    @ResponseBody
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String say() {
        return "hello";
    }

    @ApiOperation(value = "User信息查询")
    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(){
        return "xiaoming";
    }


}
