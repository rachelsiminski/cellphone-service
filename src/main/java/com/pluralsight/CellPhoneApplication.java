package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone();
        CellPhone cellPhone4 = new CellPhone();
        CellPhone cellPhone5 = new CellPhone();

        cellPhone1.setSerialNumber(1);
        cellPhone1.setModel("Pixel");
        cellPhone1.setCarrier("T-Mobile");
        cellPhone1.setPhoneNumber("000-111-1111");
        cellPhone1.setOwner("Patrick");

        cellPhone2.setSerialNumber(2);
        cellPhone2.setModel("Pixel");
        cellPhone2.setCarrier("T-Mobile");
        cellPhone2.setPhoneNumber("000-222-2222");
        cellPhone2.setOwner("Rachel");

        cellPhone3.setSerialNumber(3);
        cellPhone3.setModel("iPhone");
        cellPhone3.setCarrier("Verizon");
        cellPhone3.setPhoneNumber("000-333-3333");
        cellPhone3.setOwner("Douglas");

        cellPhone4.setSerialNumber(4);
        cellPhone4.setModel("Galaxy 7");
        cellPhone4.setCarrier("Verizon");
        cellPhone4.setPhoneNumber("000-444-4444");
        cellPhone4.setOwner("Charlotte");

        cellPhone5.setSerialNumber(5);
        cellPhone5.setModel("iPhone");
        cellPhone5.setCarrier("Mint Mobile");
        cellPhone5.setPhoneNumber("000-555-5555");
        cellPhone5.setOwner("Tyler");


        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());

        System.out.println("Serial Number: " + cellPhone2.getSerialNumber());
        System.out.println("Model: " + cellPhone2.getModel());
        System.out.println("Carrier: " + cellPhone2.getCarrier());
        System.out.println("Phone Number: " + cellPhone2.getPhoneNumber());
        System.out.println("Owner: " + cellPhone2.getOwner());

        System.out.println("Serial Number: " + cellPhone3.getSerialNumber());
        System.out.println("Model: " + cellPhone3.getModel());
        System.out.println("Carrier: " + cellPhone3.getCarrier());
        System.out.println("Phone Number: " + cellPhone3.getPhoneNumber());
        System.out.println("Owner: " + cellPhone3.getOwner());

        System.out.println("Serial Number: " + cellPhone4.getSerialNumber());
        System.out.println("Model: " + cellPhone4.getModel());
        System.out.println("Carrier: " + cellPhone4.getCarrier());
        System.out.println("Phone Number: " + cellPhone4.getPhoneNumber());
        System.out.println("Owner: " + cellPhone4.getOwner());

        System.out.println("Serial Number: " + cellPhone5.getSerialNumber());
        System.out.println("Model: " + cellPhone5.getModel());
        System.out.println("Carrier: " + cellPhone5.getCarrier());
        System.out.println("Phone Number: " + cellPhone5.getPhoneNumber());
        System.out.println("Owner: " + cellPhone5.getOwner());

    }
}

