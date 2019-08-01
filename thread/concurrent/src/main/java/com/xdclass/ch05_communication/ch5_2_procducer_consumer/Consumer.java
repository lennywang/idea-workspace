package com.xdclass.ch05_communication.ch5_2_procducer_consumer;

/**
 *
 **/
public class Consumer implements Runnable {

    private Medium medium;

    public Consumer(Medium medium){
        this.medium=medium;
    }


    @Override
    public void run() {
        while (true){
            medium.take();
        }
    }
}
