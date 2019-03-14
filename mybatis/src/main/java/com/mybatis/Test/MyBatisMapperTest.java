package com.mybatis.Test;

import com.mybatis.mapper.UserMapper2;
import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MyBatisMapperTest
 * @Description TODO
 * @Author wll
 * @Date 2019/3/15 1:02
 * @Version 1.0
 **/
public class MyBatisMapperTest {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public  void  init() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        InputStream inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void queryUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper2 mapper = sqlSession.getMapper(UserMapper2.class);
        User user = mapper.findUserById(22);
        System.out.println(user);
    }
}
