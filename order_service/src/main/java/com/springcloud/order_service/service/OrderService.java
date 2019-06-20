package com.springcloud.order_service.service;

import com.springcloud.order_service.domain.Order;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author wll
 * @Date 2019/6/5 5:08
 * @Version 1.0
 **/

public interface OrderService {

    Order save(Integer userId,Integer productId);
}
