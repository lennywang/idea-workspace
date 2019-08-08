package com.xdclass.ch06_atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 *
 **/
public class ch6_3_AtomicIntegerArray{

        public static void main(String[] args) {
            int[] arr = {3, 2};
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(arr);
            System.out.println(atomicIntegerArray.addAndGet(1, 8));
            int i = atomicIntegerArray.accumulateAndGet(0, 2, (left, right) -> left * right / 3);
            System.out.println(i);
        }
}
