package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class DaemonThreadExample {
    public static void main(String[] args) {
        MyThreadExtendingThreadClass t = new MyThreadExtendingThreadClass();
        t.setDaemon(true);
        t.start(); // check till how many outputs it generates on the console

        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Main thread completed");
       }
}
