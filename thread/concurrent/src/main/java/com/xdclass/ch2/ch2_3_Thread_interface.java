package com.xdclass.ch2;

import java.io.IOException;

/**
 *
 **/
public class ch2_3_Thread_interface implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        //public Thread(Runnable target)
        Thread thread = new Thread(new ch2_3_Thread_interface());
        thread.setName("runnable thread");
        thread.start();
    }
}
