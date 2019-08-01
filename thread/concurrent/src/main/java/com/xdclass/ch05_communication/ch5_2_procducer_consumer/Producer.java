package com.xdclass.ch05_communication.ch5_2_procducer_consumer;

/**
 *
 **/
public class Producer implements Runnable {

    private Medium medium;
    public Producer(Medium medium){
        this.medium=medium;
    }


    @Override
    public void run() {
        while (true){
            medium.put();
        }
    }
}
