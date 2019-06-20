package com.springcloud.order_service.fallback;

import com.springcloud.order_service.service.ProductClient;
import org.springframework.stereotype.Component;

/**
 *
 **/
@Component
public class ProductClientFallback implements ProductClient {
    @Override
    public String findById(Integer id) {
        System.out.println("feign 调用 product-service findbyid 异常");

        return null;
    }
}
