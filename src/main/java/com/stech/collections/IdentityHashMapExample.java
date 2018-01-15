package com.stech.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * Created by sandeeplulla
 */
public class IdentityHashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(new String("A"), "Sandeep");
        hashMap.put(new String("A"), "Ravi");

        System.out.println(hashMap);

        IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<String, String>();
        identityHashMap.put(new String("A"), "Sandeep");
        identityHashMap.put(new String("A"), "Ravi");

        System.out.println(identityHashMap);
    }
}
