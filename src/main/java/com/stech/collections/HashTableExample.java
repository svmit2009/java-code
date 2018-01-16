package com.stech.collections;

import java.util.Hashtable;

/**
 * Created by sandeeplulla
 */
public class HashTableExample {
    public static void main(String[] args){
        Hashtable<String, String> hashtable = new Hashtable();
        hashtable.put(new String("1"),"Sandeep");
        hashtable.put(new String("2"), "Ravi");
        hashtable.put(new String("3"), "Vinay");
        hashtable.put(new String("4"), "Suraj");
        hashtable.put(new String("22"), "Deepak");
        System.out.println();

        System.out.println(hashtable); //just observe how the values are printed and think on how the bucket would have been calculated.
    }
}
