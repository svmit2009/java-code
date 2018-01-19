package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class ThreadExecutionMethodsExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("t");
        t.start();

        for(int i=0;i<500; i++) {
            //Thread.yield();//uncomment to understand yield related functionality
            System.out.println("Main Thread running");
        }


        //uncomment below comment block for sleep related functionality
        /*MyThread t1 = new MyThread();
        t1.setName("t1");
        t1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        MyThread t2 = new MyThread();
        try {
            t2.setName("t2");
            t2.start();
            t2.join();

            System.out.println("Is thread alive ? : " + t2.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program"); //this should execute only after t2 has finished execution
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i=0; i<500; i++) {
            System.out.println("Child thread running. name : " + Thread.currentThread().getName());
        }
    }
}
