package com.stech.multithreading.concurrentapi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sandeeplulla
 */
public class ThreadPoolWithCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<ThreadToAddNumbers> list = new ArrayList<ThreadToAddNumbers>();
        for(int i=0; i< 100; i++) {
            list.add(new ThreadToAddNumbers(i, i*i));
        }

        for(ThreadToAddNumbers threadToAddNumbers : list) {
            Future f = executorService.submit(threadToAddNumbers);
            System.out.println("Result : " + f.get());
        }

        System.out.println("Is executor service shutdown : " + executorService.isShutdown());
        executorService.shutdown();
    }
}
