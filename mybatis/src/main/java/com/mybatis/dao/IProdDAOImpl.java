package com.mybatis.dao;

import com.mybatis.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import com.mybatis.util.SessionFactoryUtil;

import java.util.List;

/**
 * @ClassName IProdDAOImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/3/30 15:22
 * @Version 1.0
 **/
public class IProdDAOImpl implements IProdDAO {
    public List<Product> findAll() {
        SqlSession session =null;
        List<Product> products=null;
        try {
            session = SessionFactoryUtil.getSession();
            IProdDAO mapper = session.getMapper(IProdDAO.class);
            products =mapper.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return  products;
    }
}
