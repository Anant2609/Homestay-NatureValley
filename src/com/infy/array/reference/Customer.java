package com.infy.array.reference;

public class Customer {

    private String name;
    private String customerId;

    Customer(String uname, String ucustomerId){
        name = uname;
        customerId = ucustomerId;
    }

    public String getCustomerName(){
        return name;
    }
}

