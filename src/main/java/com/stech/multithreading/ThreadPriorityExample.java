package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class ThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Thread.currentThread().setPriority(1);
        MyThreadExtendingThreadClass myThreadExtendingThreadClass = new MyThreadExtendingThreadClass();
        myThreadExtendingThreadClass.setPriority(2);

        MyThreadImplementingRunnableInterface myThreadImplementingRunnableInterface = new MyThreadImplementingRunnableInterface();
        Thread thread = new Thread(myThreadImplementingRunnableInterface);
        thread.setPriority(10);

        thread.start();
        myThreadExtendingThreadClass.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main thread : " + i);
        }

        System.out.println("Main thread ends");
    }
}
