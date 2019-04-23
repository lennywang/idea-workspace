package com.spring.dao;

import com.spring.bean.User;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author wll
 * @Date 2019/4/19 6:11
 * @Version 1.0
 **/
public interface UserDao {
    void save(User user);
    void delete(Integer id);
    void update(User user);
    User getById(Integer id);
    Integer getCount();
    List<User> getList();
}
