package com.springcloud.eureka_client.service.Impl;

import com.springcloud.eureka_client.domain.Product;
import com.springcloud.eureka_client.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName ProductSericeImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/6/2 21:49
 * @Version 1.0
 **/
@Service
public class ProductSericeImpl implements ProductService {

    @Value("${server.port}")
    private String port;

    static final HashMap<Integer,Product> dataHashMap =new HashMap<Integer, Product>();

    static {
        Product p1 = new Product(1, "iphone", 9999, 10);
        Product p2 = new Product(2, "pc", 19999, 10);
        Product p3 = new Product(3, "tv", 8999, 10);
        Product p4 = new Product(4, "washmachine", 6000, 10);
        Product p5 = new Product(5, "friage", 12999, 10);
        Product p6 = new Product(6, "book", 42, 10);

        dataHashMap.put(p1.getId(), p1);
        dataHashMap.put(p2.getId(), p2);
        dataHashMap.put(p3.getId(), p3);
        dataHashMap.put(p4.getId(), p4);
        dataHashMap.put(p5.getId(), p5);
        dataHashMap.put(p6.getId(), p6);
    }

    @Override
    public List<Product> list() {
        Collection<Product> collection= dataHashMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(Integer id) {
        Product product =dataHashMap.get(id);

        //复制 Product 对象
        Product p = new Product();
        BeanUtils.copyProperties(product,p);
        String produceName=p.getName();
        produceName=String.format("%s from port:%s",produceName,port);
        p.setName(produceName);

        return p;
    }
}
