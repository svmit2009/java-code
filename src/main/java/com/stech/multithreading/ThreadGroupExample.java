package com.stech.multithreading;

/**
 * Created by sandeeplulla
 */
public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("First TG");
        ThreadGroup tg2 = new ThreadGroup(tg1, "Second TG");
        System.out.println(tg1.getParent().getName() + " " + tg2.getParent().getName());

        Thread t1 = new Thread(tg2, "t1");
        System.out.println("t1 priority : " + t1.getPriority());
        Thread t2 = new Thread(tg2, "t2");
        System.out.println("t2 priority : " + t2.getPriority());
        tg2.setMaxPriority(4); //before doing this, all the threads will retain their original priorities
        System.out.println("================================After setting priority==================");
        Thread t3 = new Thread(tg2, "10");
        System.out.println("t1 priority : " + t1.getPriority());
        System.out.println("t2 priority : " + t2.getPriority());
        System.out.println("t3 priority : " + t3.getPriority());

        tg1.list();
    }
}
