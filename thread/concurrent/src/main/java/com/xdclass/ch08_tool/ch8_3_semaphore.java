package com.xdclass.ch08_tool;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 *
 **/
public class ch8_3_semaphore {
    public static void main(String[] args){
        Semaphore semaphore = new Semaphore(2);

        for (int i=0;i<10;i++)
        {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName()+"开始执行");
                TimeUnit.SECONDS.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                semaphore.release();
            }
        }
    }
}
