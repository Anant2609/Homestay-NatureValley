package com.infy.thiskey;

public class StudentData {
    int studentId;
    String studentName;
    StudentData(int studentId, String studentName){

        this.studentId = studentId;                         //this keyword applied on instance variable
        this.studentName = studentName;
    }
    public void display() {
        System.out.println(studentId + " " +studentName);
    }



    void method1() {
        System.out.println("Inside Method 1");
    }
    void method2() {
        this.method1();                                //this keyword applied on method
        System.out.println("Inside Method 2");
    }



    StudentData() {
        System.out.println("Inside default constructor");
    }
    StudentData(int value) {

        this();                                     //this applied on default constructor
        System.out.println("Inside parameterized constructor");
    }
}
