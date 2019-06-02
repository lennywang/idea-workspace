package com.bwj.springboot02.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName DemoEvent
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 1:14
 * @Version 1.0
 **/
public class DemoEvent extends ApplicationEvent {

    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
