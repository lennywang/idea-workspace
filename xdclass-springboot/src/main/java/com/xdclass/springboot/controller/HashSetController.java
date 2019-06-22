package com.xdclass.springboot.controller;

import com.xdclass.springboot.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/hashset")
public class HashSetController {

    @RequestMapping("/t1")
    public void test1(){

        Set<Person> set = new HashSet<>();
        set.add(new Person("wang",30));
        set.add(new Person("wang",29));
        set.add(new Person("wang",30));
        set.add(new Person("li",30));

        System.out.println(set);
    }

}
