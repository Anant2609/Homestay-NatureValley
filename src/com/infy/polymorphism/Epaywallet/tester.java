package com.infy.polymorphism.Epaywallet;

class Tester {
    public static void main(String[] args) {
        User user = new User(101, "Joe", "joe@abc.com", 100.0);
        PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300.0);

        System.out.println("Congratulations " + user.getUserName() + ", payment of $70.0 was " + (user.makePayment(70.0) ? "successful!" : "unsuccessful!"));
        System.out.println("Your wallet balance is $" + user.getWalletBalance());
        System.out.println();

        System.out.println("Congratulations " + premiumUser.getUserName() + ", payment of $150.0 was " + (premiumUser.makePayment(150.0) ? "successful!" : "unsuccessful!"));
        System.out.println("Your wallet balance is $" + premiumUser.getWalletBalance());
        System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
        System.out.println();

        System.out.println("Congratulations " + premiumUser.getUserName() + ", payment of $80.0 was " + (premiumUser.makePayment(80.0) ? "successful!" : "unsuccessful!"));
        System.out.println("Your wallet balance is $" + premiumUser.getWalletBalance());
        System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
        System.out.println();

        System.out.println("Sorry " + premiumUser.getUserName() + ", you do not have enough balance to pay the bill!");
        System.out.println("Your wallet balance is $" + premiumUser.getWalletBalance());
        System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
    }
}