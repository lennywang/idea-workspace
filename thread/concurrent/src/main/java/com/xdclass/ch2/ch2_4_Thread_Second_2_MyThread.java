package com.xdclass.ch2;

/**
 *
 **/
public class ch2_4_Thread_Second_2_MyThread {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },"My Threa");

        thread.start();
    }
}
