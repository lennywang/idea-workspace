package com.bwj.service;

import com.bwj.model.User;

/**
 * @ClassName IUserService
 * @Description TODO
 * @Author wll
 * @Date 2019/4/6 11:15
 * @Version 1.0
 **/
public interface IUserService {
    public User selectUser(long userId);
}
