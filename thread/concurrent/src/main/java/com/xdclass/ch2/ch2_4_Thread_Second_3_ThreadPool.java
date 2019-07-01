package com.xdclass.ch2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 **/
public class ch2_4_Thread_Second_3_ThreadPool {
   public static void main(String[] args){
       ExecutorService service= Executors.newSingleThreadExecutor();
       service.execute(()->{
           System.out.println(Thread.currentThread().getName());
       });
   }

}
