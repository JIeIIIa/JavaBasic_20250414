package com.gmail.onishchenko.lectures.lecture12.subpackage;

import com.gmail.onishchenko.lectures.lecture12.BankAccount;

public class VipBankAccount extends BankAccount {
    public VipBankAccount(int money) {
        super(money);
    }

    public void describe() {
        System.out.println("Money from a parent class: " + getMoney());
        System.out.println("Is active" + active);
    }
}
