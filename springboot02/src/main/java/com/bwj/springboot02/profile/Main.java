package com.bwj.springboot02.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 1:08
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getContent());

        context.close();
    }
}
