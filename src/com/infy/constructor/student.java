package com.infy.constructor;

public class student {
    int StudentId;
    String name;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.StudentId + ":" + s1.name);
    }
}
