package com.bwj.springboot02.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 0:50
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
