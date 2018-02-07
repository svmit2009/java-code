package com.stech.reflection;

import com.stech.example.Employee;

/**
 * Created by sandeeplulla
 */
public class ClassExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "S", "A");
        Class c1 = e1.getClass();
        System.out.println(c1.getName());

        Employee e2 = new Employee(2, "R", "B");
        Class c2 = e2.getClass();
        System.out.println(c2.getName());

        System.out.println(c1.hashCode() == c2.hashCode());

        System.out.println(c2.getDeclaredClasses());
        System.out.println(c2.getDeclaredConstructors());
        System.out.println(c2.getDeclaredMethods());
    }
}