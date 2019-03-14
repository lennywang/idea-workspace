package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/3/14 23:33
 * @Version 1.0
 **/
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    public User queryUserById(int id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        User user=sqlSession.selectOne("queryUserById",id);
        sqlSession.close();
        return user;
    }
}
