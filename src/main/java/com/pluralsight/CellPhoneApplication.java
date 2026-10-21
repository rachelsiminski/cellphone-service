package com.pluralsight;

public class CellPhoneApplication {

    public static void main(String[] args) {

    }

    public class CellPhone {
        private int serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;

        public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
            this.serialNumber = 0;
            this.model = "";
            this.carrier = "";
            this.phoneNumber = "";
            this.owner = "";
        }

        public int getSerialNumber() {
            return this.serialNumber;
        }

    }
}

