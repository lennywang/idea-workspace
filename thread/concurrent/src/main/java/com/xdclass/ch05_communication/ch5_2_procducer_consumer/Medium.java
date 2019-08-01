package com.xdclass.ch05_communication.ch5_2_procducer_consumer;

import java.util.concurrent.TimeUnit;

/**
 *
 **/
public class Medium {
    private int num =0 ;

    private static final int TOTAL=20;

    public synchronized void put(){
        if (num<TOTAL){
            System.out.println("新增库存----->当前库存"+ ++num);
            try {
                TimeUnit.SECONDS.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notifyAll();
        }else{
            try {
                System.out.println("新增库存----->库存已满"+num);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void take(){
        if (num>0){
            System.out.println("消费库存----->当前库存容量"+num);
            try {
                TimeUnit.SECONDS.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notifyAll();
        }else {
            System.out.println("消费库存----->库存不足"+num);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
