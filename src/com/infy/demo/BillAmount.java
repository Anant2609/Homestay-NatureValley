package com.infy.demo;

public class BillAmount {

    double billAmount;
    int billId;
    int customerId;
    double discount;

  public BillAmount() {
      double discountedBillAmount = billAmount - (billAmount * (discount/100));
  }

}
