package com.gmail.onishchenko.lectures.lecture12.subpackage;

import com.gmail.onishchenko.lectures.lecture12.BankAccount;

public class Hacker {
    BankAccount bankAccount;

    public Hacker(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void hack() {
        // Field money is package-private
//        int initial = bankAccount.money;
//        int amount = 1_000_000;
//        bankAccount.money -= amount;
//        if (bankAccount.money < initial) {
//            System.out.println("I've got: " + amount);
//        } else {
//            System.out.println("Failed");
//        }
    }
}
