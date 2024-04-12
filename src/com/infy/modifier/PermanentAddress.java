package com.infy.modifier;

public class PermanentAddress extends Address{


    public static void main(String[] args) {              //protected can be accessible in same package
        Address ad = new Address();
        ad.place2 = "indore";
        System.out.println(ad.place2);



        PermanentAddress pa = new PermanentAddress();          //done by inheritance for the same class object
        pa.place2 = "bhopal";
        System.out.println(pa.place2);
    }


}
