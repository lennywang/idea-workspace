package com.example.demo.service.serviceImp;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(String user_name){userMapper.insert(user_name);}

    @Override
    public UserEntity select(String user_name){return userMapper.select(user_name);}
}
