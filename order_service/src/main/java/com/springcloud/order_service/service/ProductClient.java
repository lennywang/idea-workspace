package com.springcloud.order_service.service;

import com.springcloud.order_service.fallback.ProductClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product-service",fallback = ProductClientFallback.class)
public interface ProductClient {

    @RequestMapping("/api/v1/product/findById")
   public String findById(@RequestParam("id") Integer id);

}
