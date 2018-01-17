package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class MainThreadExample {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " " + t.getState());
    }
}