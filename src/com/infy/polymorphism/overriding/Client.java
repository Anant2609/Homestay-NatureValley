package com.infy.polymorphism.overriding;

public class Client {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.calculatesalary();

        Employee e1 = new PermanentEmployee();
        e1.calculatesalary();
    }
}
