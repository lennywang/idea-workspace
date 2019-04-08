package com.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName SessionFactoryUtil
 * @Description TODO
 * @Author wll
 * @Date 2019/3/30 15:16
 * @Version 1.0
 **/
public class SessionFactoryUtil {

    private static SqlSessionFactory sessionFactory;

    private SessionFactoryUtil(){}

    public static synchronized SqlSession getSession()
    {
        try {
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            if (sessionFactory==null){
                sessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return  sessionFactory.openSession();
    }
}
