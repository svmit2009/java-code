package com.stech.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by sandeeplulla
 */
public class VectorExample {
    public static void main(String[] args) {
        //without generics
        //default constructor
        Vector vector = new Vector();
        for(int i=0;i<200;i++) {
            vector.add(i);
        }
        printVectorDetails(vector);

        //vector with predefined capacity
        Vector vectorWithPredefinedCapacity = new Vector(33);
        for(int i=0;i<200;i++) {
            vectorWithPredefinedCapacity.add(i);
        }
        printVectorDetails(vectorWithPredefinedCapacity); //here the vector will grow double its size everytime it hits capacity.check console and verify capacity

        //vector with predefined capacity and incremental value
        Vector vectorWithPredefinedCapacityAndIncrementalValue = new Vector(33);
        for(int i=0;i<200;i++) {
            vectorWithPredefinedCapacityAndIncrementalValue.add(i);
        }
        printVectorDetails(vectorWithPredefinedCapacityAndIncrementalValue);

        LinkedList linkedList = new LinkedList();
        linkedList.add("Sandeep");
        linkedList.add(1);

        //vector from another collection
        Vector vectorFromAnotherCollection = new Vector(linkedList);
        printVectorDetails(vectorFromAnotherCollection);

        //with generics
        Vector<String> strList = new Vector<String>();
        for(int i=0;i<200;i++) {
            strList.add("S" + i);
        }
        printVectorDetails(strList);

        Vector<String> strListWithPredefinedCapacity = new Vector<String>(25);
        for(int i=0;i<200;i++) {
            strListWithPredefinedCapacity.add("S" + i);
        }
        printVectorDetails(strListWithPredefinedCapacity);

        Vector<String> strListFromAnotherCollection = new Vector<String>(linkedList);
        printVectorDetails(strListFromAnotherCollection);
    }

    private static void printVectorDetails(Vector vector) {
        System.out.println("Size of the vector : " + vector.size());
        System.out.println("Capacity of the vector : " + vector.capacity());

        Enumeration vEnum = vector.elements();
        while(vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement() );
        }
    }
}
