package com.bwj.springboot02.profile;

/**
 * @ClassName DemoBean
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 1:00
 * @Version 1.0
 **/
public class DemoBean {
    private String content;

    public DemoBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
