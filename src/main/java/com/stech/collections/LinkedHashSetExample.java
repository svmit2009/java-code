package com.stech.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by sandeeplulla
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        //without generics
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for(int i=0; i<50; i++) {
            linkedHashSet.add(i);
        }

        System.out.println(linkedHashSet.add(15)); //notice here since 15 is already present, it wont be added again
        printHashSetDetails(linkedHashSet);

        LinkedHashSet hashSetWithInitialCapacity = new LinkedHashSet(15);
        for(int i=0; i<50; i++) {
            hashSetWithInitialCapacity.add(i);
        }
        printHashSetDetails(hashSetWithInitialCapacity);

        LinkedHashSet hashSetWithInitialCapacityAndLoadFactor = new LinkedHashSet(10, 0.5f);
        for(int i=0; i<50; i++) {
            hashSetWithInitialCapacityAndLoadFactor.add(i);
        }
        printHashSetDetails(hashSetWithInitialCapacityAndLoadFactor);

        LinkedList linkedList = new LinkedList();
        linkedList.add("Sandeep");

        LinkedHashSet hashSetFromCollection = new LinkedHashSet(linkedList);
        printHashSetDetails(hashSetFromCollection);

        //with generics
        LinkedHashSet<String> strHashSet = new LinkedHashSet();
        for(int i=0; i<50; i++) {
            strHashSet.add("S" + i);
        }
        printHashSetDetails(strHashSet);

        LinkedHashSet<String> strHashSetWithInitialCapacity = new LinkedHashSet(15);
        for(int i=0; i<50; i++) {
            strHashSetWithInitialCapacity.add("S" + i);
        }
        printHashSetDetails(strHashSetWithInitialCapacity);

        LinkedHashSet<String> strHashSetWithInitialCapacityAndLoadFactor = new LinkedHashSet(10, 0.5f);
        for(int i=0; i<50; i++) {
            strHashSetWithInitialCapacityAndLoadFactor.add("S" + i);
        }
        printHashSetDetails(hashSetWithInitialCapacityAndLoadFactor);

        LinkedHashSet<Integer> strHashSetFromCollection = new LinkedHashSet(linkedList);
        printHashSetDetails(strHashSetFromCollection);
    }

    private static void printHashSetDetails(LinkedHashSet linkedHashSet) {
        System.out.println("Size of the hashset : " + linkedHashSet.size());
        System.out.println("Contents of the hashset : " + linkedHashSet);
        Iterator iterator = linkedHashSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
