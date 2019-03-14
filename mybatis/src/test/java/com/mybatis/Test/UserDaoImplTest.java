package com.mybatis.Test;

import com.mybatis.dao.UserDao;
import com.mybatis.dao.UserDaoImpl;
import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void  init() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        InputStream inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        this.sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void queryUserById() {
        UserDao userDao=new UserDaoImpl(sqlSessionFactory);
        User user=userDao.queryUserById(1);
        System.out.println(user);
    }
}