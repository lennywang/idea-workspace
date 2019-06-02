package com.bwj.springboot02.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wll
 * @Date 2019/5/22 1:49
 * @Version 1.0
 **/
public class Main {
    
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();

        context.close();
    }
}
