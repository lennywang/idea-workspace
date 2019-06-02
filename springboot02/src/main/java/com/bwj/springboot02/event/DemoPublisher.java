package com.bwj.springboot02.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoPublisher
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 1:21
 * @Version 1.0
 **/
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
