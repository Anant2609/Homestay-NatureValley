package com.infy.finaal;


class Tester {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentId(1212);
        student1.setAggregateMarks(93);
        double totalStipend = student1.calculateTotalStipend();
        System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);


        Student student2 = new Student();
        student2.setStudentId(1222);
        student2.setAggregateMarks(84);
        totalStipend = student2.calculateTotalStipend();
        System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);


        Student student3 = new Student();
        student3.setStudentId(1222);
        student3.setAggregateMarks(75);
        totalStipend = student3.calculateTotalStipend();
        System.out.println("The final stipend of " + student3.getStudentId()+" is $" + totalStipend);
    }
}
