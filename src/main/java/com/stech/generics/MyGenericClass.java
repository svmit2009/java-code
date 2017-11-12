package com.stech.generics;

/**
 * Created by sandeeplulla.
 */
public class MyGenericClass<T> {
    T obj;

    MyGenericClass(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

    public void show() {
        System.out.println("The type of obj is : " + obj.getClass().getName());
    }
}
