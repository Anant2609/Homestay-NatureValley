package com.infy.inheritance.employee;

public class EmployeeRecords {

    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
            p.setName("Anil");
            p.setEmpId(101);
            p.setBasicPay(10000);
            p.setHra(1500);
            p.setExperience(12);
            p.calculateSalary();

        ContractEmployee c = new ContractEmployee();
        c.setName("Ankit");
        c.setEmpId(102);
        c.setWages(500);
        c.setHours(10);
        c.calculateSalary();
    }

}
