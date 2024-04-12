package com.infy.demos;

public class Account {

    public double getBalance(int accountId){
        double balance = 500.00;
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        double value = acc.getBalance(123456);
        System.out.println(value);
    }
}
