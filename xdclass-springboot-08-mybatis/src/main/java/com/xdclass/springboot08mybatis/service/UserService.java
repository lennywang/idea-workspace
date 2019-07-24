package com.xdclass.springboot08mybatis.service;

import com.xdclass.springboot08mybatis.domain.User;

import java.util.List;

/**
 *
 **/
public interface UserService {

    public int add(User user);

    public List<User> findAll();

    public User findById(Integer id);

    public User update(User user);

    public Integer delete(Integer id);

    public int addAccount();
}
