package com.infy.polymorphism.overloading;

public class Student_ConsOverloading {
    int id;
    String name;

    Student_ConsOverloading(){
        this.id = 12;
        this.name = "Jack";
    }
    Student_ConsOverloading(int id){
        this.id = 11;
        this.name = "Alice";
    }
    Student_ConsOverloading(int id , String name){
        this.id = 13;
        this.name = "Jack";
    }

    public static void main(String[] args) {
        Student_ConsOverloading s1 = new Student_ConsOverloading();
        System.out.println("1st constructor " + s1.id + " " + s1.name);

        Student_ConsOverloading s2 = new Student_ConsOverloading(11);
        System.out.println("2nd constructor " + s2.id + " " + s2.name);

        Student_ConsOverloading s3 = new Student_ConsOverloading(15,"Jack");
        System.out.println("3rd constructor " + s3.id + " " + s3.name);

    }
}
