package com.bwj.service.impl;

import com.bwj.dao.IUserDao;
import com.bwj.model.User;
import com.bwj.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/4/6 11:16
 * @Version 1.0
 **/
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resources
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
