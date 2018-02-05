package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class MyThreadImplementingRunnableInterface implements Runnable {
    String name = "";
    public MyThreadImplementingRunnableInterface(String name) {
        this.name = name;
    }

    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Name : " + name + " Child thread by implemented interface : " + i);
        }
    }
}
