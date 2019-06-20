package com.springcloud.eureka_client.controller;

import com.springcloud.eureka_client.domain.Product;
import com.springcloud.eureka_client.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author wll
 * @Date 2019/6/2 21:37
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("list")
    public List<Product> list(){
        return productService.list();
    }

    @RequestMapping("findById")
    public Product findById(@RequestParam("id") int id){
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return productService.findById(id);
    }
}
