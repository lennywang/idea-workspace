package com.xdclass.ch2;

/**
 *
 **/
public class ch2_5_hang_1_DeadDemon implements Runnable {
    private static Object object =new Object();
    @Override
    public void run() {
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+"占用资源");
            Thread.currentThread().suspend();//挂起
        }
        System.out.println(Thread.currentThread().getName()+"释放资源");
    }
    
    public static void main(String[] args){
        Thread thread = new Thread(new ch2_5_hang_1_DeadDemon(), "对比线程");
        thread.start();
        sleep();
        thread.resume();//继续执行

        Thread deadThread = new Thread(new ch2_5_hang_1_DeadDemon(), "死锁线程");
        deadThread.start();
        sleep();
        thread.resume();
    }

    private static void sleep(){
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
