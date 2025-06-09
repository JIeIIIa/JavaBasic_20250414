package com.gmail.onishchenko.lectures.lecture12;

import com.gmail.onishchenko.lectures.lecture12.subpackage.Hacker;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        System.out.println("Initial money == " + bankAccount.money);
        int result = bankAccount.takeMoney(1_000_000);
        System.out.println("I have: " + result);

        Hacker hacker = new Hacker(bankAccount);
        hacker.hack();

        bankAccount.info();
    }
}
