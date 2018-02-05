package com.stech.multithreading.concurrentapi;

import java.util.concurrent.Callable;

/**
 * Created by sandeeplulla
 */
public class ThreadToAddNumbers implements Callable {

    int a;
    int b;
    public ThreadToAddNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Object call() throws Exception {
        return a + b;
    }
}
