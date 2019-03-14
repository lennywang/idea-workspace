package com.mybatis.dao;

import com.mybatis.pojo.User;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author wll
 * @Date 2019/3/14 23:31
 * @Version 1.0
 **/
public interface UserDao {

    User queryUserById(int id);

}
