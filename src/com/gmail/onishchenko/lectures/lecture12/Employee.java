package com.gmail.onishchenko.lectures.lecture12;

public class Employee {
    String name;
    String innerNumber;

    public Employee() {
        this.name = "Unknown";
        this.innerNumber = null;
    }

    public Employee(String name, String innerNumber) {
        this.name = name;
        this.innerNumber = innerNumber;
    }

    public void checkIn() {
        System.out.printf("%s[%s] is working...\n", name, innerNumber);
    }

    public void checkOut() {
        System.out.printf("%s[%s]: Go home\n", name, innerNumber);
    }
}
