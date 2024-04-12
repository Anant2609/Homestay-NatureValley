package com.infy.modifier;

public class student {

    int id;
    Address address;
    public static void main(String[] args) {
        Address ad = new Address();
        ad.place = "Chennai";//This can be accessible within same package
        System.out.println(ad.place);

        //ad.no = 965403020;
        //System.out.println(ad.no);
    }
}

