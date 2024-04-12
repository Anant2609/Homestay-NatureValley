package com.infy.polymorphism.enigma;

public class tester {
    public static void main(String[] args) {

        String customerName = "Kevin";
        String passportNo = "MN9891N";
        long []Kevin = {9452425421L ,7676765252L};
        Registration r1 = new Registration("Kevin","MN9891N",Kevin) ;
        //displayRegistrationDetails(r1);


        int licenceNo = 123;
        String customerName2 = "Julias";
        String panCardNo = "PN7878";
        long[] telephoneNo2 = { 2345615451L, 6763562562L };
        Registration r2 = new Registration("Julias", 123, "PN7878", telephoneNo2);
        //displayRegistrationDetails(r2);


        int voterId = 45453;
        String customerName3 = "Jammy";
        int licenceNo2 = 765;
        long[] telephoneNo3 = { 9634524353L, 9887373737L };
        Registration r3 = new Registration("Jammy", 45453, 765, telephoneNo3);
        //displayRegistrationDetails(r3);


        String customerName4 = "Rose";
        String panCardNo2 = "PN8934";
        int voterId2 = 34356;
        long[] telephoneNo4 = { 9867456367L, 7645367356L };
        Registration r4 = new Registration("Rose", "PN8934", 34356, telephoneNo4);
        displayRegistrationDetails(r4);

    }

    private static void displayRegistrationDetails(Registration registration) {

        System.out.println("Congratulations " + registration.customerName + "!!! you have been successfully registered for our services with the following details:");

        if (registration.getPassportNo() != null)
        {
            String passportNo = registration.getPassportNo();
            System.out.println("Passport number: " + passportNo);
        }
        else if (registration.getLicenseNo() != 0 && registration.getPanCardNo() != null)
        {
            int licenceNo = registration.getLicenseNo();
            String panCardNo = registration.getPanCardNo();
            System.out.println("License number: " + licenceNo);
            System.out.println("Pan card number: " + panCardNo);
        }
        else if (registration.getLicenseNo() != 0 && registration.getVoterId() != 0)
        {
            int licenceNo = registration.getLicenseNo();
            int voterId = registration.getVoterId();
            System.out.println("License number: " + licenceNo);
            System.out.println("Voter id: " + voterId);
        }
        else if (registration.getPanCardNo() != null && registration.getVoterId() != 0)
        {
            String panCardNo = registration.getPanCardNo();
            int voterId = registration.getVoterId();
            System.out.println("Pan card number: " + panCardNo);
            System.out.println("Voter id: " + voterId);
        }

        long[] telephoneNo = registration.getTelephoneNo();
        System.out.println("Phone numbers: ");
        for (long number : telephoneNo) {
            System.out.println(number);
        }
    }
    }
