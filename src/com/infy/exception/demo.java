package com.infy.exception;

import java.lang.reflect.Array;

public class demo {
    public static void main(String[] args) {
        int i = 7;
        int j = 0;
        String str = "Anant";
        int num[] = new int[5];

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Be in ArrayLimit" + e);
        }
        catch (Exception e){
            System.out.println("Wrong input");
        }
        System.out.println(j);
        //System.out.println("bye");
    }

}
