package com.mybatis.mapper;

import com.mybatis.pojo.User;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author wll
 * @Date 2019/3/14 23:53
 * @Version 1.0
 **/
public interface UserMapper {
  public  User queryUserById(int id);

  public User queryUserByUserName(String username);

  public int saveUser(User user);
}
