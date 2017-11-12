package com.stech.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandeeplulla.
 */
public class MyGenericsClassExample {
    public static void main(String[] args) {
        MyGenericClass<String> myG1 = new MyGenericClass<String>("Sandeep");
        System.out.println(myG1.getObj());
        myG1.show();

        MyGenericClass<Integer> myG2 = new MyGenericClass<Integer>(100);
        System.out.println(myG2.getObj());
        myG2.show();

        List<String> strList = new ArrayList<String>();
        strList.add("Sandeep");
        strList.add("Ravi");

        //uncomment to get compilation error for unexpected data type
        /*
        MyGenericClass<List<String>> myG3 = new MyGenericClass<ArrayList<String>>(strList);
        System.out.println(myG1.getObj());
        myG1.show();
        */
    }
}
