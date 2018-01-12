package com.stech.collections;

import java.util.LinkedList;

/**
 * Created by sandeeplulla
 */
public class LinkedListExample {
    public static void main(String[] args) {
        //without generics
        LinkedList linkedList = new LinkedList();
        linkedList.add("Sandeep");
        linkedList.addFirst("Before Sandeep");
        linkedList.addLast("After Sandeep");

        printLinkedListDetails(linkedList);

        linkedList.add(1, "Sandeep");
        printLinkedListDetails(linkedList);

        linkedList.remove(0);
        printLinkedListDetails(linkedList);

        linkedList.removeLast();
        printLinkedListDetails(linkedList);
    }

    private static void printLinkedListDetails(LinkedList linkedList){
        System.out.println("Size of list : " + linkedList.size());

        for(int i=0; i<linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }
    }
}
