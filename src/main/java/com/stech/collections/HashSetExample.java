package com.stech.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by sandeeplulla
 */
public class HashSetExample {
    public static void main(String[] args) {
        //without generics
        HashSet hashSet = new HashSet();
        for(int i=0; i<50; i++) {
            hashSet.add(i);
        }

        System.out.println(hashSet.add(15)); //notice here since 15 is already present, it wont be added again
        printHashSetDetails(hashSet);

        HashSet hashSetWithInitialCapacity = new HashSet(15);
        for(int i=0; i<50; i++) {
            hashSetWithInitialCapacity.add(i);
        }
        printHashSetDetails(hashSetWithInitialCapacity);

        HashSet hashSetWithInitialCapacityAndLoadFactor = new HashSet(10, 0.5f);
        for(int i=0; i<50; i++) {
            hashSetWithInitialCapacityAndLoadFactor.add(i);
        }
        printHashSetDetails(hashSetWithInitialCapacityAndLoadFactor);

        LinkedList linkedList = new LinkedList();
        linkedList.add("Sandeep");

        HashSet hashSetFromCollection = new HashSet(linkedList);
        printHashSetDetails(hashSetFromCollection);

        //with generics
        HashSet<String> strHashSet = new HashSet();
        for(int i=0; i<50; i++) {
            strHashSet.add("S" + i);
        }
        printHashSetDetails(strHashSet);

        HashSet<String> strHashSetWithInitialCapacity = new HashSet(15);
        for(int i=0; i<50; i++) {
            strHashSetWithInitialCapacity.add("S" + i);
        }
        printHashSetDetails(strHashSetWithInitialCapacity);

        HashSet<String> strHashSetWithInitialCapacityAndLoadFactor = new HashSet(10, 0.5f);
        for(int i=0; i<50; i++) {
            strHashSetWithInitialCapacityAndLoadFactor.add("S" + i);
        }
        printHashSetDetails(hashSetWithInitialCapacityAndLoadFactor);

        HashSet<Integer> strHashSetFromCollection = new HashSet(linkedList);
        printHashSetDetails(strHashSetFromCollection);
    }

    private static void printHashSetDetails(HashSet hashSet) {
        System.out.println("Size of the hashset : " + hashSet.size());
        System.out.println("Contents of the hashset : " + hashSet);
        Iterator iterator = hashSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
