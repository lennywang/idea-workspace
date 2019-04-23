package com.spring.dao.impl;

import com.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/4/7 20:29
 * @Version 1.0
 **/
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    public void sayHello() {
        System.out.println("Hello Spring ... ");
    }
}
