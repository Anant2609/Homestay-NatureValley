package com.infy.inheritance.employee;

import com.infy.inheritance.employee.Employee;

public class ContractEmployee extends Employee {

    double wages;
    int hours;

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary(){
        Salary = hours * wages;
        System.out.println("Contract Employee: Your salary is: " + Salary);

    }
}
