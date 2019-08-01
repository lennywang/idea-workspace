package com.xdclass.springboot09redis.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 **/
@Component
public class TestTask {

    @Scheduled(fixedRate = 2000)
    // @Scheduled(fixedRateString = "2000")
    //@Scheduled(fixedDelay = 2000)
    public void showtime(){
        try {
            TimeUnit.SECONDS.sleep(4L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前时间："+new Date());
    }

}
