package com.stech.generics;

public class GenericMethodExample {
    public static void main(String[] args) {
        myGenericMethod(1.23);
    }

    public static <T extends Number & Comparable> void myGenericMethod(T obj) {
        System.out.println(obj.getClass().getName());
    }
}
