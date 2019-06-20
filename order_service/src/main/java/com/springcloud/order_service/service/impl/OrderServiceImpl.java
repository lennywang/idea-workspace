package com.springcloud.order_service.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.springcloud.order_service.domain.Order;
import com.springcloud.order_service.service.OrderService;
import com.springcloud.order_service.service.ProductClient;
import com.springcloud.order_service.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author wll
 * @Date 2019/6/5 5:38
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private ProductClient productClient;

    @Override
    public Order save(Integer userId, Integer productId) {


        //Ribbon - 调用方式一
        //Map<String, Object> objectMap = restTemplate.getForObject("http://product-service/api/v1/product/findById?id=" + productId, Map.class);

        //Ribbon - 调用方式二
        // String productService = "product-service";
        // ServiceInstance instance = loadBalancerClient.choose(productService);
        // String url = String.format("http://%s/api/v1/product/findById?id=%s", productService, productId);
        // Map<String, Object> productMap = restTemplate.getForObject(url, Map.class);
        // String name = productMap.get("name").toString();

        //Feign
        String response = productClient.findById(productId);
        JsonNode jsonNode = JsonUtils.str2JsonNode(response);

        //try {
        //    TimeUnit.SECONDS.sleep(1);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        Order order = new Order();
        order.setTradeId(UUID.randomUUID().toString());
        order.setUserId(userId);
        order.setProductId(productId);
        //productName 调用远程接口
        String produceName = jsonNode!=null? jsonNode.get("name").toString():"";//objectMap.get("name").toString();//name;//
        order.setProductName(produceName);

        return order;
    }
}
