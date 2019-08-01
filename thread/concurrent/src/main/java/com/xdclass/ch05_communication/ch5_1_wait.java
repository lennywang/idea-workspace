package com.xdclass.ch05_communication;

import java.util.concurrent.TimeUnit;

/**
 *
 **/
public class ch5_1_wait {

    private static volatile boolean flag=false;

    public static void main(String[] args){
            new Thread(()->{
                while (!flag){
                    try {
                        TimeUnit.SECONDS.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("flag is false");
                }
            }).start();

        try {
            TimeUnit.SECONDS.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
                flag=true;
            }).start();
    }

}
