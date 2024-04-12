package com.infy.demo;

public class CalculateDistance {
    double speed;
    double time;

public CalculateDistance(){
    this.speed = speed;
    this.time = time;
}

public double calculateDistance(){
    double timeinhours = time/60;
    return speed * timeinhours;
}



    public static void main(String[] args) {

    double speed = 90;
    double time = 100;

        CalculateDistance calculateDistance = new CalculateDistance();
        double distance = calculateDistance.calculateDistance();
        System.out.println(distance);
    }
}
