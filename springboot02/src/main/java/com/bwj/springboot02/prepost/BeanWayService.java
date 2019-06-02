package com.bwj.springboot02.prepost;

/**
 * @ClassName BeanWayService
 * @Description TODO
 * @Author wll
 * @Date 2019/5/23 0:36
 * @Version 1.0
 **/
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
