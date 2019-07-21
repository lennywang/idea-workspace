package com.xdclass.ch08_tool;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 *
 **/
public class ch8_2_cyclicbarrier {
    public static void main(String[] args){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(8);
        for (int i=0;i<8;i++)
        {
            int finalI=i;
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(finalI*1L);
                    System.out.println(Thread.currentThread().getName()+"准备就绪");
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("开始比赛");
            }).start();
        }
    }
}
