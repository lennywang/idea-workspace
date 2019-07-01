package com.xdclass.utils;

/**
 *
 **/
public class ThreadUtil {

    public static void sleep(long sleepTime){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

    public static  void print(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

}
