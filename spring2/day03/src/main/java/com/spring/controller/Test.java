package com.spring.controller;

import com.spring.bean.ConfigProperty;
import com.spring.bean.SettingProperty;
import com.spring.bean.User;
import com.spring.dao.UserDao;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author wll
 * @Date 2019/4/19 6:18
 * @Version 1.0
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class Test {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Resource(name="settingProperty")
    private SettingProperty settingProperty;

    @Resource(name = "configProperty")
    private ConfigProperty configProperty;

    @org.junit.Test
    public void save(){
        User user=new User();
        user.setName("tom");
        userDao.save(user);
    }

    @org.junit.Test
    public void delete(){
        Integer integer=1;
        userDao.delete(integer);
    }

    @org.junit.Test
    public void update(){
        User user =new User();
        user.setId(1);
        user.setName("jerty");
        userDao.update(user);
    }

    @org.junit.Test
    public void getById(){
        Integer integer=1;
        User user = userDao.getById(integer);
        System.out.println(user);
    }

    @org.junit.Test
    public void getCount(){
        Integer integer=userDao.getCount();
        System.out.println(integer);
    }

    @org.junit.Test
    public void getList(){
        List<User> list = userDao.getList();
        System.out.println(list);
    }

    @org.junit.Test
    public void getConfigure(){
        System.out.println(configProperty.getAuthorName());
        System.out.println(configProperty.getProjectInfo());
    }

    @org.junit.Test
    public void  getSetting(){
        System.out.println(settingProperty.getAuthorName());
        System.out.println(settingProperty.getProjectInfo());
    }
}
