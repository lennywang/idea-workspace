package com.xdclass.ch2;

import com.xdclass.utils.ThreadUtil;

/**
 *
 **/
public class ch2_6_interrupt_1_Demo implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName());
            ThreadUtil.sleep(1000L);
        }
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ch2_6_interrupt_1_Demo());
        thread.start();
        ThreadUtil.sleep(2000L);
        thread.stop();
    }
}
