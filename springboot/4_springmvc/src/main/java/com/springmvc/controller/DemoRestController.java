package com.springmvc.controller;

import com.springmvc.model.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson",produces = {"application/json;chastset=UTF-8"})
    public DemoObj getjson(DemoObj obj){
        return new DemoObj(obj.getId()+1,obj.getName()+"xx");
    }

    @RequestMapping(value = "/getxml",produces = {"application/xml;chastset=UTF-8"})
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId()+1,obj.getName()+"xx");
    }
}
