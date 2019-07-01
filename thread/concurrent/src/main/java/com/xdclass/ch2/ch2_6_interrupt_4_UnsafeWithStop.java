package com.xdclass.ch2;

import com.xdclass.utils.ThreadUtil;

/**
 *
 **/
public class ch2_6_interrupt_4_UnsafeWithStop extends Thread {

    private int i =0;
    private int j=0;

    @Override
    public void run() {
        i++;
        ThreadUtil.sleep(2000L);
        j++;
    }

    private void  printf(){
        System.out.println("ide 值："+i);
        System.out.println("jde 值："+j);
    }

    public static void main(String[] args){
        ch2_6_interrupt_4_UnsafeWithStop unsafeWithStop = new ch2_6_interrupt_4_UnsafeWithStop();
        unsafeWithStop.start();
        ThreadUtil.sleep(1000L);
        unsafeWithStop.stop();
        unsafeWithStop.printf();
    }
}
