package com.infy.encapsulation;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class demo {

    public static void main(String[] args) {
        human obj = new human();
        obj.setAge(20);
        obj.setName("ravi");

        System.out.println(obj.getAge() + ":" + obj.getName());


    }
}
