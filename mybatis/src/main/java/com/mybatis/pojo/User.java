package com.mybatis.pojo;

import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author wll
 * @Date 2019/3/9 9:06
 * @Version 1.0
 **/
public class User {
    private int id;
    private String username;// 用户姓名
    private String sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}

