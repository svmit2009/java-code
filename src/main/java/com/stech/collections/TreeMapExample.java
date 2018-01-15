package com.stech.collections;

import java.util.TreeMap;

/**
 * Created by sandeeplulla
 */
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap();
        treeMap.put("Z", "Sandeep");
        treeMap.put("A", "Ravi");
        treeMap.put("a", "Suraj");
        treeMap.put("1", "Sunny");

        System.out.println(treeMap);

        //some methods specific to sortedset
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
    }
}
