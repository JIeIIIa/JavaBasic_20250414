package com.gmail.onishchenko.lectures.lecture12;

public class Accounter extends Employee{
    String name;
    String innerNumber;

    public Accounter(String name, String innerNumber) {
        this.name = name;
        this.innerNumber = innerNumber;
    }

    public void makeReport() {
        System.out.printf("%s[%s] Making a report...\n", name, innerNumber);
    }
}
