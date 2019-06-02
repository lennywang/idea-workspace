package com.bwj.springboot02.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoListener
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 1:17
 * @Version 1.0
 **/
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg =demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息："+msg);
    }
}
