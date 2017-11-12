package com.stech.generics;

/**
 * Created by sandeeplulla.
 */
public class BoundedTypeClass<T extends String> {
    T obj;

    BoundedTypeClass(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

    public void concate() {
        obj.concat("Done");
    }

    public void show() {
        System.out.println("The type of obj is : " + obj.getClass().getName());
    }
}
