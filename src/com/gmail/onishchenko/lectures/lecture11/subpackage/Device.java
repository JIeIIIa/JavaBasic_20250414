package com.gmail.onishchenko.lectures.lecture11.subpackage;

public class Device {
    public String serialNumber;
    public int year;

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
        year = 2025;
    }

    public Device(String serialNumber, int year) {
        this.serialNumber = serialNumber;
        this.year = year;
    }

    public void describe() {
        System.out.println("I'm device with serialNumber == " + serialNumber);
        System.out.println("Production year == " + year);
        System.out.println();
    }
}
