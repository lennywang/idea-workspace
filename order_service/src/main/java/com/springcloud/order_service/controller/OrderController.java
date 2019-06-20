package com.springcloud.order_service.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.order_service.domain.Order;
import com.springcloud.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author wll
 * @Date 2019/6/5 5:08
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping("save")
    @HystrixCommand(fallbackMethod = "saveOrderFail")
    public Object save(@RequestParam("userId") int userId, @RequestParam("productId") int productId) {
        Map<String, Object> data = new HashMap<>();
        data.put("code", 0);
        data.put("msg", orderService.save(userId, productId));

        return data;
    }

    private Object saveOrderFail(int userId, int productId) {
        Map<String, Object> mgg = new HashMap<>();
        mgg.put("code", -1);
        mgg.put("msg", "抢购人数太多，您被挤出来了，请稍后重试");

        return mgg;
    }
}
