package com.xdclass.ch09_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 **/
public class Excutor {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        //ExecutorService service = Executors.newFixedThreadPool(5);
        ExecutorService cachedExecutorService = Executors.newCachedThreadPool();
        for (int i=0;i<10;i++)
        {
            //service.submit(myTask);
            cachedExecutorService.submit(myTask);
        }
    }
}

class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis()+"：Thread ID："+Thread.currentThread().getId());
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
