package com.mybatis.dao;

import com.mybatis.pojo.Product;

import java.util.List;

public interface IProdDAO {
    public List<Product> findAll();
}
