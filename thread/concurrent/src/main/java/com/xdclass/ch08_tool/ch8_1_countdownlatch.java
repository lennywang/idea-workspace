package com.xdclass.ch08_tool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 *
 **/
public class ch8_1_countdownlatch {
    public static void main(String[] args){
        CountDownLatch countDownLatch = new CountDownLatch(8);
        new Thread(()->{
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("800米比赛结束，准备清空跑道并继续跨栏比赛");
        }).start();

        for (int i=0;i<8;i++)
        {
            int finalI=i;
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(finalI*1L);
                    System.out.println(Thread.currentThread().getName()+"到达终点");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    countDownLatch.countDown();
                }
            }).start();
        }
    }
}
