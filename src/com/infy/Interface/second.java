package com.infy.Interface;

public class second {
    public static void main(String[] args) {
        demoInterface dm;
        dm = new demo();
        dm.show();
        dm.config();

        System.out.println(demoInterface.age);
        System.out.println(dm.area);
    }
}
