package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class MyThreadImplementingRunnableInterface implements Runnable {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Child thread by implemented interface : " + i);
        }
    }
}
