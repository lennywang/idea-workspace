package com.xdclass.ch09_pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 **/
public class Excutor_ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        //scheduledExecutorService.scheduleAtFixedRate
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(System.currentTimeMillis() / 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}
