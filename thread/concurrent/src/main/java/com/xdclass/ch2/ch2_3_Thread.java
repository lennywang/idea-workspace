package com.xdclass.ch2;

/**
 *
 **/
public class ch2_3_Thread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        ch2_3_Thread thread = new ch2_3_Thread();
        thread.setName("excentd thread");
        thread.start();
    }
}
