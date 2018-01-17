package com.stech.multithreading;

import com.stech.example.DetailsPrinter;
import com.stech.example.Printer;

/**
 * Created by sandeeplulla
 */
public class SynchronizedExample {
    public static void main(String[] args) {
        Printer p = new Printer();

        DetailsPrinter d1 = new DetailsPrinter("d1", p);
        DetailsPrinter d2 = new DetailsPrinter("d2", p);
        DetailsPrinter d3 = new DetailsPrinter("d3", p);

        Thread t1 = new Thread(d1);
        t1.start();

        Thread t2 = new Thread(d2);
        t2.start();

        Thread t3 = new Thread(d3);
        t3.start();
    }
}
