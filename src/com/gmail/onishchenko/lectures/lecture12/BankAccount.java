package com.gmail.onishchenko.lectures.lecture12;

public class BankAccount {
    private int money;
    private boolean active;

    public BankAccount(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 0) {
            this.money = money;
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
