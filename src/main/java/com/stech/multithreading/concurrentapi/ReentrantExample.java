package com.stech.multithreading.concurrentapi;

import com.stech.example.DetailsPrinter;
import com.stech.example.Printer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sandeeplulla
 */
public class ReentrantExample {
    public static void main(String[] args) {
        System.out.println("Start of program");

        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();

        System.out.println("Lock hold count : " + reentrantLock.getHoldCount());
        System.out.println("Lock queue length : " + reentrantLock.getQueueLength());
        System.out.println("Lock hold by current thread : " + reentrantLock.isHeldByCurrentThread());
        System.out.println("Lock acquired : " + reentrantLock.isLocked());

        reentrantLock.lock();
        reentrantLock.unlock();

        System.out.println("========================After unlock========================");
        System.out.println("Lock hold count : " + reentrantLock.getHoldCount());
        System.out.println("Lock queue length : " + reentrantLock.getQueueLength());
        System.out.println("Lock hold by current thread : " + reentrantLock.isHeldByCurrentThread());
        System.out.println("Lock acquired : " + reentrantLock.isLocked());

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

        System.out.println("End of program");

    }
}