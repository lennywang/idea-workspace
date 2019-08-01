package com.xdclass.springboot09redis.task;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 **/
@Component
public class AsyncTask {
    public void task1(){
        long begin = System.currentTimeMillis();
        Interapted(1L);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时："+(end-begin));
    }

    public void task2(){
        long begin = System.currentTimeMillis();
        Interapted(2L);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时："+(end-begin));
    }

    public void task3(){
        long begin = System.currentTimeMillis();
        Interapted(3L);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时："+(end-begin));
    }

    public Future<String> task4(){
        long begin = System.currentTimeMillis();
        Interapted(2L);
        long end = System.currentTimeMillis();
        System.out.println("任务4耗时："+(end-begin));
        return new AsyncResult<String>("任务4");
    }

    public Future<String> task5(){
        long begin = System.currentTimeMillis();
        Interapted(3L);
        long end = System.currentTimeMillis();
        System.out.println("任务5耗时："+(end-begin));
        return new AsyncResult<String>("任务5");
    }

    public Future<String> task6(){
        long begin = System.currentTimeMillis();
        Interapted(1L);
        long end = System.currentTimeMillis();
        System.out.println("任务6耗时："+(end-begin));
        return new AsyncResult<String>("任务6");
    }

    public void Interapted(long timeConsult){
        try {
            TimeUnit.SECONDS.sleep(timeConsult);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
