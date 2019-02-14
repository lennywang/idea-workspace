package com.wincom.dao;

import com.wincom.model.UserEntity;

public interface UserDao {
    UserEntity getUser(Integer uid);
    void  saveUser(UserEntity user);
}
