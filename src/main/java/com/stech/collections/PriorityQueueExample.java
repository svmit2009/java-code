package com.stech.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by sandeeplulla
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue();
        System.out.println(priorityQueue.offer("Sandeep"));
        System.out.println(priorityQueue.offer("Ravi"));
        System.out.println(priorityQueue.offer("Suraj"));
        System.out.println(priorityQueue.offer("Vinay"));
        System.out.println(priorityQueue);

        PriorityQueue<String> priorityQueueWithComparator = new PriorityQueue(10, new Comparator() {
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;

                if (s1.length() == s2.length()) return 0;
                return s1.length() > s2.length() ? 1 : -1;
            }
        });

        System.out.println(priorityQueueWithComparator.offer("Sandeep"));
        System.out.println(priorityQueueWithComparator.offer("Ravi"));
        System.out.println(priorityQueueWithComparator.offer("Suraj"));
        System.out.println(priorityQueueWithComparator.offer("Vinay"));

        System.out.println(priorityQueueWithComparator);

        System.out.println(priorityQueueWithComparator.poll());
        System.out.println(priorityQueueWithComparator);
        priorityQueueWithComparator.clear();
        //System.out.println(priorityQueueWithComparator.remove()); //uncomment and see if exception occurs
    }
}
