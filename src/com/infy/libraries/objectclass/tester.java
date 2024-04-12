package com.infy.libraries.objectclass;

public class tester {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"anant");
        Employee emp2 = new Employee(1,"anat");

        System.out.println(emp1);
        System.out.println(emp1.getClass());
        System.out.println(emp2.hashCode());
        System.out.println(emp1.equals(emp2));

    }
}
