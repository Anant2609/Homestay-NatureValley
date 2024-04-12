package com.infy.array;

import java.util.Arrays;

public class demoarray {
    public static void main(String[] args) {
        int n1[] = {1, 2, 3, 4, 5};

        n1[2] = 30;
        System.out.println(n1[2]);

        int n2[] = new int[4];
        n2[0] = 4;
        n2[1] = 8;
        n2[2] = 12;
        n2[3] = 16;

        System.out.println(n2[3]);

        int[] ids = new int[3];
        int count = 1;
        ids[0] = 1001;
        ids[1] = 1002;
        ids[2] = 1003;

        for (int i = 0; i < ids.length; ++i) {
            System.out.println("ID " + count + ": " + ids[i]);
            ++count;
        }

        double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};


        int[][] marks1 = new int[2][];

        marks1[0] = new int[]{22, 11};
        System.out.println(Arrays.toString(marks1[0]));


        int marks[][] = {{58, 70, 67}, {48, 88, 74}, {54, 94, 75}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

}
