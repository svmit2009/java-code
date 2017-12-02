package com.stech.generics;

import java.util.ArrayList;

public class WildCardExample {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("1");
        strList.add("2");
        strList.add("Sandeep");

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        ArrayList<Double> doubleList= new ArrayList<Double>();
        doubleList.add(1.1);
        doubleList.add(1.2);

        System.out.println("Printing string list : ");
        printValue(strList);
        System.out.println("Printing int list : ");
        printValue(intList);
        System.out.println("Printing double list : ");
        printValue(doubleList);

        //ArrayList<?> list1 = new ArrayList<?>();
        ArrayList<?> list2 = new ArrayList<Object>();
        ArrayList<? extends Object> list3 = new ArrayList<String>();
        ArrayList<? super String> list4 = new ArrayList<Object>();
        //ArrayList<? super String> list5 = new ArrayList<Integer>();
    }

    //Uncomment below line to see errors and then create separate methods for ArrayList<Integer> and ArrayList<Double>
//    public static void printValue(ArrayList<String> inputValues) {
        public static void printValue(ArrayList<?> inputValues) {
            for(int i=0; i<inputValues.size();i++) {
                System.out.println(inputValues.get(i));
            }
        }
}
