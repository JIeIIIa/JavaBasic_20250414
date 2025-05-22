package com.gmail.onishchenko.lectures.lecture11.subpackage;

public class Device {
    public String serialNumber;
    public int year;

    public Device(String number, int productionYear) {
        serialNumber = number;
        year = productionYear;
    }

    public void describe() {
        System.out.println("I'm device with serialNumber == " + serialNumber);
        System.out.println("Production year == " + year);
        System.out.println();
    }
}
