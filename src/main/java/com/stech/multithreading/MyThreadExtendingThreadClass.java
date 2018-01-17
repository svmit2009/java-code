package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class MyThreadExtendingThreadClass extends Thread {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Child Thread by extending Thread : " + i);
        }
    }
}
