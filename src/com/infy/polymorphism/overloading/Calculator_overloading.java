package com.infy.polymorphism.overloading;

public class Calculator_overloading {

    public void add(int a , int b){                                        //method overloading
        System.out.println("Sum for two Int is: " + (a+b));
    }
    public void add(int a , float b){
        System.out.println("Sum for One Int and one float is: " + (a+b));
    }
    public void add(int a , int b , double c){
        System.out.println("Sum for two Int and One double is: " + (a+b+c));
    }

    public static void main(String[] args) {
        Calculator_overloading c = new Calculator_overloading();
        c.add(1,4);
        c.add(5,4f);
        c.add(10,4,5.5);
    }
}
