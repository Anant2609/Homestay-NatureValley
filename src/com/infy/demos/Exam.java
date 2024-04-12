package com.infy.demos;

public class Exam {

    static int total = 100;
    int score = 87;
    public void totalMarks() {
        int marks = 90;
        System.out.println(total);
    }
    public static void main(String[] args){
        int data = 50;
        Exam sem = new Exam();
        //System.out.println(score);
        System.out.println(sem.score);
        //System.out.println(marks);
        System.out.println(data);
        System.out.println(total);
    }
}
