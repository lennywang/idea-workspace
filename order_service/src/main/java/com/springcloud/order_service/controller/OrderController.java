package com.springcloud.order_service.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.order_service.domain.Order;
import com.springcloud.order_service.service.OrderService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("save")
    @HystrixCommand(fallbackMethod = "saveOrderFail")
    public Object save(@RequestParam("userId") int userId, @RequestParam("productId") int productId) {
        Map<String, Object> data = new HashMap<>();
        data.put("code", 0);
        data.put("msg", orderService.save(userId, productId));

        return data;
    }

    /**
     * 注意方法签名一定要和api方法一致
     **/
    private Object saveOrderFail(int userId, int productId, HttpServletRequest request) {

        String saveOrderKey="save-order";
        String sendValue=redisTemplate.opsForValue().get(saveOrderKey);
        final String ip = request.getRemoteAddr();
        new Thread(()->{
            if (StringUtils.isBlank(sendValue)){
                System.out.println("紧急短信，用户下单失败，请查找原因，ip地址是："+ip);
                redisTemplate.opsForValue().set(saveOrderKey,"save-order-fail",20, TimeUnit.SECONDS);
            }else {
                System.out.println("已经发送过短信");
            }
        }).start();

        Map<String, Object> mgg = new HashMap<>();
        mgg.put("code", -1);
        mgg.put("msg", "抢购人数太多，您被挤出来了，请稍后重试");

        return mgg;
    }
}
