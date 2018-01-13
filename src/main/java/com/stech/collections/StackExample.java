package com.stech.collections;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Created by sandeeplulla
 */
public class StackExample {
    public static void main(String[] args) {
        //without generics
        Stack stack = new Stack();
        for(int i=0;i<200;i++) {
            stack.push(i);
        }

        stack.push("Sandeep Lulla");

        System.out.println("Top of the stack : " + stack.peek());
        printStackDetails(stack);

        for(int i=0; i<55; i++) {
            stack.pop();
        }

        System.out.println("Top of the stack : " + stack.peek());
        printStackDetails(stack);

        System.out.println("Position of element 78 : " + stack.search(78));

        //with generics
        Stack<Integer> intStack = new Stack();
        for(int i=0;i<200;i++) {
            intStack.push(i);
        }

        //intStack.push("Sandeep"); //not allowed as stack is created using generic constructor

        System.out.println("Top of the stack : " + intStack.peek());
        printStackDetails(intStack);

        for(int i=0; i<55; i++) {
            intStack.pop();
        }

        System.out.println("Top of the stack : " + intStack.peek());
        printStackDetails(intStack);

        System.out.println("Position of element 78 : " + intStack.search(78));
        System.out.println("Position of element 150 : " + intStack.search(150));
    }

    private static void printStackDetails(Stack stack) {
        Enumeration sEnum= stack.elements();

        while(sEnum.hasMoreElements()) {
            System.out.println(sEnum.nextElement());
        }
    }
}
