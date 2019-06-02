package com.springcloud.eureka_client.service;

import com.springcloud.eureka_client.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> list();

    Product findById(Integer id);
}
