package com.xdclass.springboot.service.impl;

import com.xdclass.springboot.domain.User;
import com.xdclass.springboot.mapper.UserMapper;
import com.xdclass.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        userMapper.add(user);
        int id =user.getId();

        return id;
    }
}
