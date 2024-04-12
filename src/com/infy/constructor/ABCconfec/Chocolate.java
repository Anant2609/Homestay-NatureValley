package com.infy.constructor.ABCconfec;

public class Chocolate {
    int barCode;
    String name;
    int cost;
    int weight;

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    Chocolate(){
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost=10;


    }
}
