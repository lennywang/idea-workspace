package com.bwj.dao;

import com.bwj.model.User;

/**
 * @ClassName IUserDao
 * @Description TODO
 * @Author wll
 * @Date 2019/4/6 11:15
 * @Version 1.0
 **/
public interface IUserDao {
    User selectUser(long id);
}
