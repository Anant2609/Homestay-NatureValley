package com.infy.inheritance.employee;

import com.infy.inheritance.employee.Employee;

public class PermanentEmployee extends Employee {
    double basicPay;
    double hra;
    int experience;
    double variableComponent;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        if (experience < 3) {
            variableComponent = ((basicPay * 0 / 100));
        } else if (experience < 5) {
            variableComponent = ((basicPay * 5 / 100));
        } else if (experience < 10) {
            variableComponent = ((basicPay * 7 / 100));
        } else {
            variableComponent = ((basicPay * 12 / 100));
        }
        Salary = variableComponent + hra + basicPay;
        System.out.println("Permanent Employee: Your salary is:" + Salary);

    }

}
