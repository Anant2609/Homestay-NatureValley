package com.infy.constructor.ABCconfec;

public class tester {
    public static void main(String[] args) {
        Chocolate c = new Chocolate();
        System.out.println("Barcode  : "+c.getBarCode());
        System.out.println("Cadbury : " +c.getName());
        System.out.println("Weight : " +c.getWeight());
        System.out.println("Cost : "+ c.getCost());

        Chocolate c2 = new Chocolate();
        c2.setBarCode(102);
        c2.setName("Hershey's");
        c2.setWeight(24);
        c2.setCost(50);

        System.out.println("Barcode  : "+c2.getBarCode());
        System.out.println("Cadbury : "+c2.getName());
        System.out.println("Weight : "+c2.getWeight());
        System.out.println("Cost : "+c2.getCost());
    }
}

