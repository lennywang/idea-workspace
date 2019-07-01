package com.xdclass.ch2;

import com.xdclass.utils.ThreadUtil;

/**
 *
 **/
public class ch2_5_hang_3_WaitDemo implements Runnable {

    private static Object object =new Object();
    private static Object waitObject =new Object();

    @Override
    public void run() {
        synchronized (waitObject){
            System.out.println(Thread.currentThread().getName()+"占用资源");
            try {
                waitObject.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"释放资源");
    }

    public static void main(String[] args){
        Thread thread = new Thread(new ch2_5_hang_3_WaitDemo(), "对比线程");
        thread.start();

        Thread thread2 = new Thread(new ch2_5_hang_3_WaitDemo(), "对比线程2");
        thread2.start();
        ThreadUtil.sleep(3000L);

        synchronized (waitObject){
            waitObject.notify();
        }
    }
}
