package com.stech.collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by sandeeplulla
 */
public class ArrayListExample {
    public static void main(String[] args) {
        //without generics
        //default constructor
        ArrayList arrayList = new ArrayList();
        for(int i=0;i<200;i++) {
            arrayList.add(i);
        }
        printListDetails(arrayList);

        //array list with predefined capacity
        ArrayList arrayListWithPredefinedCapacity = new ArrayList(25);
        for(int i=0;i<200;i++) {
            arrayListWithPredefinedCapacity.add(i);
        }
        printListDetails(arrayListWithPredefinedCapacity); //here the list will grow to 200 even if it was initialized to 25

        LinkedList linkedList = new LinkedList();
        linkedList.add("Sandeep");
        linkedList.add(1);

        //array list from another collection
        ArrayList arrayListFromAnotherCollection = new ArrayList(linkedList);
        printListDetails(arrayListFromAnotherCollection);

        //with generics
        ArrayList<String> strList = new ArrayList<String>();
        for(int i=0;i<200;i++) {
            strList.add("S" + i);
        }
        printListDetails(strList);

        ArrayList<String> strListWithPredefinedCapacity = new ArrayList<String>(25);
        for(int i=0;i<200;i++) {
            strList.add("S" + i);
        }
        printListDetails(strListWithPredefinedCapacity);

        ArrayList<String> strListFromAnotherCollection = new ArrayList<String>(linkedList);
        printListDetails(strListFromAnotherCollection);
    }

    private static void printListDetails(ArrayList arrayList) {
        System.out.println("Size of the list : " + arrayList.size());

        for(int i=0; i<arrayList.size();i++) {
            System.out.println(i + " : " + arrayList.get(i));
        }
    }
}
