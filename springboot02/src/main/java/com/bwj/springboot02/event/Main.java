package com.bwj.springboot02.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 1:24
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
