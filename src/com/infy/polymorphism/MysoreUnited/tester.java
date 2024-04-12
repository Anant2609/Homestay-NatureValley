package com.infy.polymorphism.MysoreUnited;

public class tester {
    public static void main(String[] args) {
        playerRating player1 = new playerRating(1, "Beckham");
        player1.calculateAverageRating(9, 9.9f);
        player1.calculate();
        player1.display();

        playerRating player2 = new playerRating(1,"Oscar");
        player2.calculateAverageRating(1,1,1);
        player2.calculate();
        player2.display();
    }
}
