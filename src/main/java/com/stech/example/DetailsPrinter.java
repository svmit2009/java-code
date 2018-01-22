package com.stech.example;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sandeeplulla on 17/1/18.
 */
public class DetailsPrinter implements Runnable {
    Printer printer;
    String printerName;

    public DetailsPrinter(String printerName, Printer p) {
        this.printer = p;
        this.printerName = printerName;
    }

    public void run() {
        //toggle comments between below 2 statements to understand the difference between synchronized & non-synchronized
        printer.nonSynchronizedPrinter(printerName);
        //printer.synchronizedPrinter(printerName);
    }
}
