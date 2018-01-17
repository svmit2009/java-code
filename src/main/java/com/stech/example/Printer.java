package com.stech.example;

/**
 * Created by sandeeplulla
 */
public class Printer {
    public void nonSynchronizedPrinter(String name) {
        for(int i=0;i<250;i++) {
            System.out.println(name + " " + i);
        }
    }

    public synchronized void synchronizedPrinter(String name) {
        for(int i=0;i<250;i++) {
            System.out.println(name + " " + i);
        }
    }
}
