package com.infy.exception;

public class thrw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;

            if(j==0)
                throw new anantException("Enter valid input");
                //throw new ArithmeticException("Enter valid number");  //use of throw keyword
        } catch (anantException e) {
            j=18/1;
            System.out.println("default input" + e);

        }catch (Exception e) {
            System.out.println("Wrong input");
        }
        System.out.println(j);
    }
}
