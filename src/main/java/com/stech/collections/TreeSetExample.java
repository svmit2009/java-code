package com.stech.collections;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by sandeeplulla
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(0);
        //treeSet.add("a"); //uncomment to see runtime exception. treeset does not support mix or heterogenous objects
        //treeSet.add(null); //uncomment to see runtime exception. tree set does not support null insertion
        treeSet.remove(2);

        System.out.println(treeSet);

        TreeSet strTreeSet = new TreeSet();
        strTreeSet.add("A");
        strTreeSet.add(new String("a"));
        //strTreeSet.add(new StringBuilder("a")); //uncomment to see runtime exception. Tree  set can only store elements of types that implement Comparable interface if we do not specify sorting order.
        System.out.println(strTreeSet);

        TreeSet treeSetWithComparator = new TreeSet(new Comparator() {
            public int compare(Object a1, Object a2) {
                int intA = (Integer) a1;
                int intB = (Integer) a2;
                if(intA == intB) return 0;
                return intA>intB?-1:1;
            }
        });

        treeSetWithComparator.add(1);
        treeSetWithComparator.add(5);
        treeSetWithComparator.add(2);
        treeSetWithComparator.add(0);

        System.out.println(treeSetWithComparator);

        TreeSet treeSetFromSortedSet = new TreeSet(treeSetWithComparator);

        System.out.println(treeSetFromSortedSet);

        //some methods from sorted set and navigable set
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.subSet(0,5));
    }
}
