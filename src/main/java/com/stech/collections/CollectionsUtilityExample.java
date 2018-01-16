package com.stech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sandeeplulla
 */
public class CollectionsUtilityExample {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(25);
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(100);

        System.out.println("Before sorting : " + arrayList);

        Collections.sort(arrayList);

        System.out.println("After sorting : " + arrayList);

        Collections.sort(arrayList, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;

                if(i1 == i2) return 0;
                return i2>i1?1:-1;
            }
        });

        System.out.println("After applying custom comparator : " + arrayList);

        System.out.println(Collections.binarySearch(arrayList, 10));
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 125));

        arrayList.add(125);
        Collections.reverse(arrayList);
        System.out.println("After reversing : " + arrayList);
    }
}
