package com.bwj.springboot02.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName JSR250WayService
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 0:39
 * @Version 1.0
 **/
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
