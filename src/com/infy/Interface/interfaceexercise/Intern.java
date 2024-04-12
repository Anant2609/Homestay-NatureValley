package com.infy.Interface.interfaceexercise;

public class Intern implements DataProvider{
    int marksSecured ;
    int graceMarks;

    Intern(int marksSecured,int graceMarks){
       this.marksSecured=marksSecured;
       this.graceMarks=graceMarks;
   }

    @Override
    public void calcPercentage() {

    }
}
