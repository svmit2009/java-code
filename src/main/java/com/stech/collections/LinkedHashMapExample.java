package com.stech.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by sandeeplulla
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap();
        for(int i=0; i<100; i++) {
            hashMap.put("S" + i, new Date().toString());
        }

        System.out.println(hashMap);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
        for(int i=0; i<100; i++) {
            linkedHashMap.put("S" + i, new Date().toString());
        }

        System.out.println(linkedHashMap);
    }
}
