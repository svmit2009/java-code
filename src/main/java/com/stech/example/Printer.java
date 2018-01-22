package com.stech.example;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sandeeplulla
 */
public class Printer {
    ReentrantLock lock = new ReentrantLock();

    public void nonSynchronizedPrinter(String name) {

        //comment this if block for synchronized keyword example
        if(lock.tryLock()) {
            System.out.println("Got the lock...will process");
        }
        else {
            System.out.println("was not able to get the lock. will return");
            return;
        }

        lock.lock(); //comment this for synchronized keyword example
        for(int i=0;i<250;i++) {
            System.out.println(name + " " + i);
        }
        System.out.println("Number of threads waiting : " + lock.getQueueLength());
        lock.unlock(); //comment this for synchronized example
    }

    public synchronized void synchronizedPrinter(String name) {
        for(int i=0;i<250;i++) {
            System.out.println(name + " " + i);
        }
    }
}
