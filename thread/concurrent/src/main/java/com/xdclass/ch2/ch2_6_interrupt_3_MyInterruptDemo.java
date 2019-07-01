package com.xdclass.ch2;

import com.xdclass.utils.ThreadUtil;

/**
 *
 **/
public class ch2_6_interrupt_3_MyInterruptDemo implements Runnable {

    private static volatile boolean FLAG =true;

    @Override
    public void run() {
        while (FLAG){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ch2_6_interrupt_3_MyInterruptDemo());
        thread.start();
        ThreadUtil.sleep(3000L);
        FLAG=false;
    }
}
