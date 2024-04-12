package com.infy.finaal;

public class Student {
    int stipend;
    int studentId;
    int aggregateMarks;

    int baseAmount = 100;

     public final double calculateTotalStipend(){
        if (aggregateMarks <=85 || aggregateMarks<90 ){
            stipend=baseAmount+10;
        } else if (aggregateMarks<=90 || aggregateMarks<95) {
            stipend=baseAmount+15;
        }else {
            stipend=baseAmount+20;
         }
         return stipend;
     }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    public int getStipend() {
        return stipend;
    }
}
