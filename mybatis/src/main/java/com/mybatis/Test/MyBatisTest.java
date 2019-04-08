package com.mybatis.Test;

import com.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @ClassName MyBatisTest
 * @Description TODO
 * @Author wll
 * @Date 2019/3/9 9:07
 * @Version 1.0
 **/
public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void init() throws Exception {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 3. 创建SqlSessionFactory对象
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testQueryUserById() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. 执行SqlSession对象执行查询，获取结果User
        // 第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数；
        Object user = sqlSession.selectOne("queryUserById", 1);

        // 6. 打印结果
        System.out.println(user);

        // 7. 释放资源
        sqlSession.close();
    }

    @Test
    public void testQueryUserByUserName() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. 执行SqlSession对象执行查询，获取结果User
        // 第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数；
         List<User> userList = sqlSession.selectList("queryUserByUserName", "王");

        // 6. 打印结果
         for (User u : userList){
             System.out.println(u);
         }

        // 7. 释放资源
        sqlSession.close();
    }

    @Test
    public void tesSaveUser() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. 执行SqlSession对象执行查询，获取结果User
        //'王路路','1989-9-13',1,'中国北京'
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        User user =new User("王路路234","1",simpleDateFormat.parse("1989-9-13"),"中国北京");

        // 第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数；
        Integer integer = sqlSession.insert("saveUser", user);

        // 6. 打印结果
        System.out.println(integer);

        // 7. 释放资源
        sqlSession.close();
    }

}
