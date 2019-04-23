package com.spring.controller;

import com.spring.dao.UserDao;
import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Main
 * @Description TODO
 * @Author wll
 * @Date 2019/4/4 22:52
 * @Version 1.0
 **/
public class Main {

    @Autowired
    UserDao userDao;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Main main = new Main();

        UserDao uDao = (UserDao) applicationContext.getBean("userDao");
        uDao.sayHello();

        User user = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user");
        System.out.println(user);
        System.out.println(user==user2);

    }




}
