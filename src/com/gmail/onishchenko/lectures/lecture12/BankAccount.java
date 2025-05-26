package com.gmail.onishchenko.lectures.lecture12;

public class BankAccount {
    int money;

    public BankAccount(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        if (money > 0) {
            this.money += money;
        } else {
            System.out.println("Wrong amount");
        }
    }

    public int takeMoney(int money) {
        if (money > 0 && this.money > money) {
            this.money -= money;

            return money;
        } else {
            return 0;
        }
    }

    public void info() {
        System.out.println("Money == " + money);
    }
}
