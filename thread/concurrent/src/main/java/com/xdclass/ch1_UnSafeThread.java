package com.xdclass;

import java.util.concurrent.CountDownLatch;

/**
 *
 **/
public class ch1_UnSafeThread {
    private static int num = 0;

    private static CountDownLatch countDownLatch = new CountDownLatch(10);

    /**
     * 每次调用对num进行++ 操作
     **/
    public static void inCrease(){
        num++;
    }

    public static void main(String[] args){
        for (int i=0;i<10;i++){
            new Thread(()->{
                for (int j=0;j<100;j++){
                    inCrease();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                countDownLatch.countDown();
            }).start();
        }

        while (true){
            if (countDownLatch.getCount()==0){
                System.out.println(num);
                break;
            }
        }
    }
}
