package com.wincom.service;

import com.wincom.model.UserEntity;

public interface UserService {
    UserEntity getUser(Integer uid);
    void  saveUser(UserEntity user);
}
