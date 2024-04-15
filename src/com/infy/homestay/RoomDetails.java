package com.infy.homestay;

public class RoomDetails implements RoomBillComponent {

    int billId;
    String customerName;
    String typeOfRoom;
    int noOfExtraPersons;
    int noOfDaysOfStays;
    private static int counter= 101;

    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStays) {
        this.billId=counter++;   //
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPersons = noOfExtraPersons;
        this.noOfDaysOfStays = noOfDaysOfStays;
    }
    public void validateNoOfExtraPerson() {
        if (noOfExtraPersons > 2) {
            System.out.println("Error - Maximum of 2 extra persons allowed per room.");
        }
    }

    public void validateTypeOfRoom() {
        if (!typeOfRoom.equalsIgnoreCase("Standard") &&                  //
                !typeOfRoom.equalsIgnoreCase("Deluxe") &&
                !typeOfRoom.equalsIgnoreCase("Cottage") &&
                !typeOfRoom.equalsIgnoreCase("Premium"));
        {
            System.out.println("Error - Invalid room type.");
        }
    }

    public void validateNoOfDaysOfStay() {
        if (noOfDaysOfStays < 1 || noOfDaysOfStays > 15) {
            System.out.println("Error - Stay must be between 1 and 15 days.");
        }
    }
    public double calculateBill() {
        validateTypeOfRoom();
        validateNoOfDaysOfStay();
        validateNoOfExtraPerson();

        double baseRoomFare = 0;
        switch (typeOfRoom.toLowerCase()) {
            case "standard": baseRoomFare = 2500; break;
            case "deluxe":   baseRoomFare = 3500; break;
            case "cottage":  baseRoomFare = 5500; break;
        }

        double totalBill = (noOfDaysOfStays * baseRoomFare) +
                (noOfDaysOfStays * FOOD_CHARGE) + (EXTRA_PERSON_CHARGE * noOfExtraPersons);
        totalBill =totalBill + (TAX * totalBill);
        return totalBill;
    }
}

