package com.stech.multithreading.concurrentapi;

import com.stech.example.DetailsPrinter;
import com.stech.example.Printer;
import com.stech.multithreading.MyThreadImplementingRunnableInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sandeeplulla
 */
public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<MyThreadImplementingRunnableInterface> list = new ArrayList<MyThreadImplementingRunnableInterface>();
        for(int i=0; i< 100; i++) {
            list.add(new MyThreadImplementingRunnableInterface("Thread " + i));
        }

        for(MyThreadImplementingRunnableInterface myThreadImplementingRunnableInterface : list) {
            executorService.submit(myThreadImplementingRunnableInterface);
        }

        System.out.println("Is executor service shutdown : " + executorService.isShutdown());
        executorService.shutdown();
    }
}
