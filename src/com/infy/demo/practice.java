package com.infy.demo;

public class practice {
    public static void main(String[] args) {

        byte b = 111;
        int a = 120;
        b = (byte) a;                             //type conversion
        System.out.println(b + " type conversion");


        int c = 121;
        int d = 9;
        int e = 5;
        int f = 9;

        boolean result = c > d || e > f;         //logical operators
        System.out.println(result + " logical operator");


        if (a>b && b>c)                         //if-else and if-else-if
            System.out.println("hello");
        else if (b>a && b>c)
            System.out.println("bye");
        else if (c>a && c>b)
            System.out.println("3rd");
        else
            System.out.println("4th");


        int n = c % 2 == 0 ? 10 : 20;          //ternary operator
        System.out.println(n + " Ternary operator");


        int m = 7;                            //switch case
        switch (m){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thrusday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            default ->System.out.println("sunday");
        }


        int i = 1;                                      //while loop
        while (i <= 3) {
            System.out.println("Hi "  +  i);
            int j = 1;
            while(j<=2){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye");


        int x = 4;                  //do-while loop(if condition is false and what to run the code for a single time)
        do
        {
            System.out.println("DO-while "  +  x);
            x++;
        }
        while (x <= 3);


        for(int g=1;g<=5;g++){                     //for loop
            System.out.println("For DAY " + g);
            for(int j=1;j<=9;j++){
               System.out.println(" " + (j+8) + "-" + (j+9));
            }

        }
    }
}
