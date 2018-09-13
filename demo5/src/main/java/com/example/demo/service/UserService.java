package com.example.demo.service;

import com.example.demo.entity.UserEntity;

public interface UserService {
    void insert(String user_name);

    UserEntity select(String user_name);
}
