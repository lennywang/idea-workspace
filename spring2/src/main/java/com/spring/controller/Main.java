package com.spring.controller;

import com.spring.dao.UserDao;
import com.spring.model.CollectionBean;
import com.spring.model.HelloWorld;
import com.spring.model.User;
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

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        // helloWorld.hello();

        Main main = new Main();
        //demo
        UserDao userDao = main.demo(applicationContext);
        userDao.sayHello();

        //b_create
        User user1=main.b_create(applicationContext,"user");
        User user2 = main.b_create(applicationContext, "user2");
        User user3 = main.b_create(applicationContext, "user3");
        System.out.println("==================bean开始==================");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("==================bean结束==================");


        //b_create
        User user4=main.b_create(applicationContext,"user4");
        User user5 = main.b_create(applicationContext, "user5");
        User user6= main.b_create(applicationContext, "user6");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println("==================开始==================");
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.println(collectionBean);
        System.out.println("==================结束==================");
    }

    /**
     * @Author chengpunan
     * @Description demo
     * @Date2019/4/7 21:35
     * @Param [applicationContext]
     * @return com.spring.dao.UserDao
     **/
    public UserDao demo(ApplicationContext applicationContext) {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.sayHello();
        return userDao;
    }

    /**
     * @Author chengpunan
     * @Description bean
     * @Date2019/4/7 22:21
     * @Param [applicationContext, beanName]
     * @return com.spring.model.User
     **/
    public User b_create(ApplicationContext applicationContext,String beanName){
        User user= (User) applicationContext.getBean(beanName);
        return user;
    }



}
