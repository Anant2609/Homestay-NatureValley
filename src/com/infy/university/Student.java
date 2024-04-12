package com.infy.university;

public class Student {
    int studentId;
    String name;
    float qualifyingExamMarks;
    char residentialStatus;
    int yearOFEngg;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }

    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public int getYearOFEngg() {
        return yearOFEngg;
    }

    public void setYearOFEngg(int yearOFEngg) {
        this.yearOFEngg = yearOFEngg;
    }

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Anant");
        student1.setYearOFEngg(2019);
        student1.setStudentId(0103);
        student1.setResidentialStatus('D');
        student1.setQualifyingExamMarks(60);

        System.out.println("Name of the student :" + student1.getName());
        System.out.println("Year of the student :" + student1.getYearOFEngg());
        System.out.println("ID of the student :" + student1.getStudentId());
        System.out.println("Residency of the student :" + student1.getResidentialStatus());
        System.out.println("Marks of the student :" + student1.getQualifyingExamMarks());
    }
}
