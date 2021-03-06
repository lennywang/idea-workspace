package com.xdclass.springboot08mybatis.service.impl;

import com.xdclass.springboot08mybatis.domain.User;
import com.xdclass.springboot08mybatis.mapper.UserMapper;
import com.xdclass.springboot08mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 *
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        userMapper.insert(user);
        int id =user.getId();
        return id;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User update(User user) {
        return userMapper.update(user);
    }

    @Override
    public Integer delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addAccount() {
        User user = new User();
        user.setAge(30);
        user.setName("事务");
        user.setCreateTime(new Date());
        user.setPhone("18516800306");
        Integer i = userMapper.insert(user);
        int a=9/0;

        return i;
    }
}
