package com.infy.calcuClassObj;

public class object {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add();
        System.out.println(calculator);

        ;
        calculator.n1 = 10;
        calculator.n2 = 5;
        int Addresult = calculator.addition(calculator.n1, calculator.n2);



      //  int Subresult = calculator.Subtraction(110,10);
//        float Divresult = calculator.division();
//        int Multiresult = calculator.multiplication();
//        float Modresult = calculator.modulas();

        System.out.println(Addresult);
      //  System.out.println(Subresult);
//        System.out.println(Divresult);
//        System.out.println(Multiresult);
//        System.out.println(Modresult);

    }




}
