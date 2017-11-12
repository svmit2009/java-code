package com.stech.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandeeplulla.
 */
public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("Sandeep");
        s1.add("Ravi");

        for (String s:s1) {
            System.out.println(s);
        }

        List<String> s2 = new ArrayList<String>();
        s2.add("Sandeep");
        s2.add("Ravi");

        for (String s:s2) {
            System.out.println(s);
        }

        //uncomment below comment to get unexpected type error
        /*
        List<int> i1 = new ArrayList<int>();
        i1.add(1);
        i1.add(2);

        for (int i:i1) {
            System.out.println(i);
        }*/

        //Uncomment below multiline comment to get incompatible data types error
        /*
        List<Object> s3 = new ArrayList<String>();
        s3.add("Sandeep");
        s3.add("Ravi");

        for (String s:s3) {
            System.out.println(s);
        } */
    }
}
