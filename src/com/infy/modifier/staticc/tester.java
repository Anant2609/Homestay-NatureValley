package com.infy.modifier.staticc;

public class tester {

        public static void main (String[] args){

            //Create 2 objects of Loan class using the default and 2 using parametrized constructor.
            Loan loan1 = new Loan();
            Loan loan2 = new Loan();
            Loan loan3 = new Loan(14567, 1, 1000.0f, 12, 5.0f);
            Loan loan4 = new Loan(56789, 2, 2000.0f, 24, 4.5f);

            //Use getter methods and display the value of loanCounter for every instance
              System.out.println("Loan Counter for loan1: " + loan1.getLoanCounter());
              System.out.println("Loan Counter for loan2: " + loan2.getLoanCounter());
              System.out.println("Loan Counter for loan3: " + loan3.getLoanCounter());
              System.out.println("Loan Counter for loan4: " + loan4.getLoanCounter());

        }


}
