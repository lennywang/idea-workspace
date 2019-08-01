package com.xdclass.ch05_communication;

/**
 *
 **/
public class ch5_1_notify {
    private static volatile boolean flag =false;

    public static void main(String[] args){
        Object object = new Object();
        new Thread(()->{
            while (!flag){
                synchronized (object){
                    try {
                        System.out.println("flag is false");
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("flag is true");
        }).start();

        new Thread(()->{
            flag=true;
            synchronized (object)
            {
                object.notify();
            }
        }).start();
    }
}
