package com.stech.generics;

import com.stech.example.Employee;

import java.util.ArrayList;

/**
 * Created by sandeeplulla.
 */
public class TypeSafety {
    public static void main(String args[]) {

        Employee[] employees;
        employees = new Employee[100];
        employees[0] = new Employee(1, "Sandeep", "IT");
        employees[1] = new Employee(2, "Ravi", "CE");
        employees[2] = new Employee(3, "Alan", "IT");
        //employees[3] = "Sandeep"; //This gives a compilation error since arrays are typesafe. Uncomment and compile to see the error.

        for(int i=0; i<100;i++) {
            System.out.println(employees[i]);
        }

        ArrayList employeeList = new ArrayList();
        employeeList.add(new Employee(1, "Sandeep", "IT"));
        employeeList.add(new Employee(2, "Ravi", "CE"));
        employeeList.add(new Employee(3, "Alan", "IT"));
        employeeList.add("Sandeep");

        for(int i=0; i<employeeList.size();i++) {
            if(employeeList.get(i) instanceof Employee) //Comment this to get ClassCastException
                System.out.println(((Employee) employeeList.get(i)).getId());
        }

        //Using Generics
        ArrayList<Employee> employeeListGenerics = new ArrayList();
        employeeListGenerics.add(new Employee(1, "Sandeep", "IT"));
        employeeListGenerics.add(new Employee(2, "Ravi", "CE"));
        employeeListGenerics.add(new Employee(3, "Alan", "IT"));
        //employeeListGenerics.add("Sandeep"); //Uncomment this to get compilation error

        for(int i=0; i<employeeListGenerics.size();i++) {
            System.out.println(employeeListGenerics.get(i).getId());
        }
    }
}
