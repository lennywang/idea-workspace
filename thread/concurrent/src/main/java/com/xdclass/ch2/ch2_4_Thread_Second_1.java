package com.xdclass.ch2;

/**
 *
 **/
public class ch2_4_Thread_Second_1 {

    public static void main(String[] args){
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"Thread by Lambda").start();
    }
}
