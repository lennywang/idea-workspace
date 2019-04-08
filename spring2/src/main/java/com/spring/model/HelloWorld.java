package com.spring.model;

/**
 * @ClassName HelloWorld
 * @Description TODO
 * @Author wll
 * @Date 2019/4/4 22:48
 * @Version 1.0
 **/
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello()
    {
        System.out.println("hello:" +name);
    }
}
