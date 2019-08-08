package com.xdclass.ch06_atomic;

import java.util.concurrent.atomic.LongAccumulator;

/**
 *
 **/
public class ch6_2_LongAccumulator {
    public static void main(String[] args) {
        LongAccumulator longAccumulator = new LongAccumulator((left, right) ->left * right, 0L);
        longAccumulator.accumulate(3L);
        System.out.println(longAccumulator.get());

        longAccumulator.accumulate(5L);
        System.out.println(longAccumulator.get());
    }

}
