package com.infy.polymorphism.MysoreUnited;

public class playerRating {
    int playerPositon;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char category;

    playerRating(int playerPositon, String playerName) {
        this.playerPositon = playerPositon;
        this.playerName = playerName;
    }
    public void calculateAverageRating(float criticOneRating, float criticTwoRating ){
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.averageRating = (criticOneRating + criticTwoRating) / 2;

    }
    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.criticThreeRating = criticThreeRating;
        this.averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
    }
    public void calculate()
    {
        if (averageRating > 8) {
                category = 'A';
            } else if (averageRating > 5 && averageRating <= 8) {
                category = 'B';
            } else if (averageRating > 0 && averageRating <= 5) {
                category = 'C';
            }

    }
    void display(){
        System.out.println("The player name is " + playerName);
        System.out.println("The player name is "+ playerPositon);
        System.out.println("The average rating is " + averageRating);
        System.out.println("The category is " + category);

    }

}

