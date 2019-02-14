package com.wincom.service.impl;

import com.wincom.dao.UserDao;
import com.wincom.model.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Transactional(rollbackOn = {Exception.class,RuntimeException.class})
    public UserEntity getUser(Integer uid) {
        return userDao.getUser(uid);
    }

    @Transactional(rollbackOn = {Exception.class,RuntimeException.class})
    public void saveUser(UserEntity user) {
        userDao.saveUser(user);
    }
}
