package com.stech.collections;

import java.util.*;

/**
 * Created by sandeeplulla
 */
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        for(int i=0; i<200;i++) {
            strList.add("S" + i);
        }
        for(int i=0; i<200;i++) {
            strList.add("B" + i);
        }

        printDetailsUsingIterator(strList);

        LinkedList<String> strLinkedList = new LinkedList<String>();
        for(int i=0; i<200;i++) {
            strLinkedList.add("S" + i);
        }
        for(int i=0; i<200;i++) {
            strLinkedList.add("B" + i);
        }
        printDetailsUsingIterator(strLinkedList);

        Vector<String> strVector = new Vector<String>();
        for(int i=0; i<200;i++) {
            strVector.add("S" + i);
        }
        for(int i=0; i<200;i++) {
            strVector.add("B" + i);
        }

        printDetailsUsingIterator(strVector);
    }

    private static void printDetailsUsingIterator(Collection collection) {
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            String s = (String) iterator.next();

            if(s.contains("S"))
                iterator.remove();
        }
        System.out.println(collection);
    }
}
