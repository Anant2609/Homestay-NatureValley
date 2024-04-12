package com.infy.homestay;

import java.util.logging.Logger;

public class Tester {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger("Tester");
        RoomDetails StandardroomDetails = new RoomDetails("John", "Standard", 4, 2);
        RoomDetails DeluxeroomDetails = new RoomDetails("Max", "Deluxe", 2, 4);
        RoomDetails CottageroomDetails = new RoomDetails("Will", "Cottage", 2, 3);

        double StandardtotalBill = StandardroomDetails.calculateBill();
        double DeluxetotalBill = DeluxeroomDetails.calculateBill();
        double CottagetotalBill = CottageroomDetails.calculateBill();

        //logger.info("BillId: " + StandardroomDetails.billId);

        System.out.println("BillId: " + StandardroomDetails.billId);
        System.out.println("Customer Name: " + StandardroomDetails.customerName);
        System.out.println("No. of days of Stay: " + StandardroomDetails.noOfDaysOfStays);
        System.out.println("Total Bill: " + StandardtotalBill);

        System.out.println();

        System.out.println("BillId: " + DeluxeroomDetails.billId);
        System.out.println("Customer Name: " + DeluxeroomDetails.customerName);
        System.out.println("No. of days of Stay: " + DeluxeroomDetails.noOfDaysOfStays);
        System.out.println("Total Bill: " + DeluxetotalBill);

        System.out.println();

        System.out.println("BillId: " + CottageroomDetails.billId);
        System.out.println("Customer Name: " + CottageroomDetails.customerName);
        System.out.println("No. of days of Stay: " + CottageroomDetails.noOfDaysOfStays);
        System.out.println("Total Bill: " + CottagetotalBill);

    }
}
