package com.stech.generics;

/**
 * Created by sandeeplulla.
 */
public class MultipleBoundedTypeClass<T extends String & Runnable & Comparable<String>> {
//public class MultipleBoundedTypeClass<T extends Runnable> { //this works fine
//public class MultipleBoundedTypeClass<T extends Runnable & String> { // uncomment and see compilation issue


    T obj;

    MultipleBoundedTypeClass(T o) {
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
