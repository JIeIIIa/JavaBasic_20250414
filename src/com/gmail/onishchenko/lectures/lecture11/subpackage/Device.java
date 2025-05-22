package com.gmail.onishchenko.lectures.lecture11.subpackage;

public class Device {
    public String serialNumber;
    public int year;

    public Device() {
        this("default", 2025);
        System.out.println("I'm a default constructor");
//        this("value");
    }

    public Device(String serialNumber) {
        this(serialNumber, 2025);
        System.out.println("Constructor with ONE parameter");
    }

    public Device(String serialNumber, int year) {
        System.out.println("Constructor with TWO parameter");
        this.serialNumber = serialNumber;
        this.year = year;
    }

    public void describe() {
        System.out.println("I'm device with serialNumber == " + serialNumber);
        System.out.println("Production year == " + year);
        System.out.println();
    }
}
