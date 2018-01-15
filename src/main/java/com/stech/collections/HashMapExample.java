package com.stech.collections;

import java.util.HashMap;

/**
 * Created by sandeeplulla
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        System.out.println(map.put(1, "Sandeep"));
        System.out.println(map.put(2, "Ravi"));
        System.out.println(map.put(3, "Suraj"));
        System.out.println(map.put(1, "Surya"));

        HashMap hashMap = new HashMap();
        hashMap.put(1, "Sandeep");
        hashMap.put(2, "Ravi");
        hashMap.put(3, "Suraj");
        hashMap.put(1, "Surya");

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsValue(4));
        System.out.println(hashMap.put(null, null));

        System.out.println(hashMap.size());
        System.out.println(hashMap.entrySet().getClass());
    }
}
