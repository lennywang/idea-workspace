package com.spring.utils;

import com.spring.model.User;

/**
 * @ClassName UserFactory
 * @Description TODO
 * @Author wll
 * @Date 2019/4/7 21:32
 * @Version 1.0
 **/
public class UserFactory {
    public static User createUser(){
        System.out.println("静态工厂创建User");
        return new User();
    }

    public  User createUser2(){
        System.out.println("实例工厂创建User");
        return new User();
    }
}
