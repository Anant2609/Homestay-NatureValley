package com.infy.typecasting;

public class demo {

        public static void main(String args[]) {

            String result="";
            int[] message =new int[]{74, 97, 118, 97, 32, 105, 115, 32, 103, 114, 101, 97, 116};

            for(int i=0 ; i<message.length ; i++) {
                result=result+(char)message[i];
            }

            System.out.println(result);
        }

}
