package com.gmail.onishchenko.lectures.lecture05;

public class ConditionDemo {
    public static void main(String[] args) {
        int a = -10;
        int b = -10;

        if ((a > 0) & (b > 0)) {
            System.out.println("a and b more than zero!");
        }
        if (a > 0 | b > 0) {
            System.out.println("a OR b more than zero!");
        }
    }
}
