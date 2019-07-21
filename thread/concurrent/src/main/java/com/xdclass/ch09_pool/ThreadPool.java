package com.xdclass.ch09_pool;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 **/
public class ThreadPool {
    public static void main(String[] args){
        LinkedBlockingQueue<Runnable> objects = new LinkedBlockingQueue<>(20);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 3L, TimeUnit.SECONDS, objects, new CustomPolicy());
        threadPoolExecutor.prestartAllCoreThreads();
        for (int i = 0; i < 50; i++) {
            threadPoolExecutor.submit(()->{
                try {
                    TimeUnit.SECONDS.sleep(1L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(threadPoolExecutor.getActiveCount());
            });
        }

    }
}
