package com.gmail.onishchenko.lectures.lecture12;

public class Accounter extends Employee {
    String name;
    String innerNumber;

    public Accounter(String name, String innerNumber) {
        super(name, innerNumber);
        this.name = name + "-=in Accounter=-";
        this.innerNumber = innerNumber + "-=in Accounter=-";
    }

    public void makeReport() {
        System.out.printf("%s[%s] Making a report...\n", name, innerNumber);
    }

    public void describe() {
        String name = "fake name";
        System.out.println("My is " + name);
        System.out.println("My is " + this.name);
        System.out.println("Name in parent class is " + super.name);
    }
}
