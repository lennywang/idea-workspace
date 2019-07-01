package com.xdclass.ch2;

import com.xdclass.utils.ThreadUtil;

/**
 *
 **/
public class ch2_7_priority_1_PriorityDemo {
    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            while (true) {
                ThreadUtil.print();
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                ThreadUtil.print();
            }
        });

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }
}
