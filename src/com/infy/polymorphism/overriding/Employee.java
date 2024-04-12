package com.infy.polymorphism.overriding;

public class Employee {
    int Salary ;
    int basicSalary = 15000;

    public  void calculatesalary(){
        int salary = basicSalary;
        System.out.println(salary);
    }
}
