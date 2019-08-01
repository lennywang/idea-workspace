package com.xdclass.ch05_communication.ch5_2_procducer_consumer;

/**
 *
 **/
public class Main {
    public static void main(String[] args){
        Medium medium= new Medium();

        new Thread(new Consumer(medium)).start();
        new Thread(new Consumer(medium)).start();
        new Thread(new Consumer(medium)).start();

        new Thread(new Producer(medium)).start();
        new Thread(new Producer(medium)).start();
        new Thread(new Producer(medium)).start();
        new Thread(new Producer(medium)).start();
        new Thread(new Producer(medium)).start();
    }
}
