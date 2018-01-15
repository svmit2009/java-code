package com.stech.collections;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by sandeeplulla
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        for(int i=0; i<200;i++) {
            strList.add("S" + i);
        }
        for(int i=0; i<200;i++) {
            strList.add("B" + i);
        }

        System.out.println("Original list : " + strList);
        ListIterator listIterator = strList.listIterator();

        //traversing elements in forward direction
        while(listIterator.hasNext()) {
            String s = (String) listIterator.next();

            //adding objects while traversing
            if(s.contains("B"))
                listIterator.add("Added using list iterator");

            //removing objects while traversing
            if(s.contains("S"))
                listIterator.remove();
        }

        System.out.println("After forward traversal : " + strList);

        //traversing elements while traversing
        while(listIterator.hasPrevious()) {
            String s = (String) listIterator.previous();
            //System.out.println(s);

            //replacing objects using list iterator
            if(s.contains("B"))
                listIterator.set("Replaced object");
        }

        System.out.println("After backward traversal : " + strList);
    }
}
