package com.stech.multithreading;

/**
 * Created by sandeeplulla.
 */
public class MyThreadExample {
    public static void main(String[] args){
        System.out.println("Main thread started");

        MyThreadExtendingThreadClass myThreadExtendingThreadClass = new MyThreadExtendingThreadClass();
        myThreadExtendingThreadClass.start();
//        myThreadExtendingThreadClass.start(); //uncomment this to see IllegalThreadStateException

        MyThreadImplementingRunnableInterface myThreadImplementingRunnableInterface = new MyThreadImplementingRunnableInterface("");
        Thread thread = new Thread(myThreadImplementingRunnableInterface);
        thread.start();

        for(int i=0; i<100; i++) {
            System.out.println("Main thread : " + i);
        }

        System.out.println("Main thread ends");
    }
}
