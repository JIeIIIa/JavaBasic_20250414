package com.gmail.onishchenko.lectures.lecture12;

public class Security extends Employee {
    public Security(String name, String innerNumber) {
        super(name, innerNumber);
//        this();
        this.name = name;
        this.innerNumber = innerNumber;
    }

    public void validateVisitor() {
        System.out.printf("%s[%s] Validating...\n", name, innerNumber);
    }
}
