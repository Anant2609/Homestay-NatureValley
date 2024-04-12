package com.infy.polymorphism.Epaywallet;

public class PremiumUser extends User {
    private int rewardPoints;
    public PremiumUser(int id, String userName, String email, double walletBalance) {
        super(id, userName, email, walletBalance);
        rewardPoints = 0;

    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public boolean makePayment(double billAmount) {
        if (walletBalance >= billAmount) {
            walletBalance -= billAmount;
            return true;
        }
        return false;
    }

}