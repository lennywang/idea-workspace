package com.xdclass.ch2;

import com.xdclass.utils.ThreadUtil;

/**
 *
 **/
public class ch2_6_interrupt_2_InterruptDemo implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ch2_6_interrupt_2_InterruptDemo());
        thread.start();
        ThreadUtil.sleep(1000L);
        thread.interrupt();
    }
}
