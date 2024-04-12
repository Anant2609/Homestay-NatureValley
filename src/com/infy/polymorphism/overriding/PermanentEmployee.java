package com.infy.polymorphism.overriding;

public class PermanentEmployee extends Employee{
    int HRA = 4000;
    int DA = 2500;
@Override
    public  void calculatesalary(){
        int salary = basicSalary+HRA+DA;
        System.out.println(salary);
    }
}
