package com.xdclass.ch2;

import com.xdclass.utils.ThreadUtil;

/**
 *
 **/
public class ch2_5_hang_2_SuspendDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行run方法，准备调用suspend方法");
        Thread.currentThread().suspend();
        System.out.println(Thread.currentThread().getName()+"执行run方法，调用susspend方法结束");
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ch2_5_hang_1_DeadDemon());
        thread.start();
        ThreadUtil.sleep(3000L);
        thread.resume();
    }
}
