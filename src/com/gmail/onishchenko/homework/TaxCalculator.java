package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double income = 1000;
        System.out.println("Input your income: ");
        double income = scanner.nextDouble();

        double taxPercent = 0;
        if (income < 10_000) {
            taxPercent = 0.025;
        } else if (income < 25_000) {
            taxPercent = 0.043;
        } else if (25_000 <= income) {
            taxPercent = 0.067;
        }

        double amount = income * taxPercent;
        System.out.println("Your taxes == " + amount);
    }
}
