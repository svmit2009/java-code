package com.stech.reflection;

/**
 * Created by sandeeplulla
 */
public class HeapStatistics {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Max memory : " + runtime.maxMemory());
        System.out.println("Free memory : " + runtime.freeMemory());
        System.out.println("Total memory : " + runtime.totalMemory());
    }
}
