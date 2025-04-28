package com.gmail.onishchenko.lectures.lecture05;

public class ConditionDemo {
    public static void main(String[] args) {
        int a = -10;
        int b = -10;

        if ((a > 0) && (b > 0)) {
            System.out.println("a and b more than zero!");
        }
        if (a > 0 || b > 0) {
            System.out.println("a OR b more than zero!");
        }

        if (!(a > 0)) { // if (a <= 0) {
            System.out.println("a <= 0");
        } else {
            System.out.println("a > 0");
        }

        if (!((a > 0) & (b > 0))) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        if (((a > 0) & (b > 0))) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
        if (!(a > 0) | !(b > 0)) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        boolean flag = true;
        boolean option = true;
        System.out.println("flag ^ options is " + (flag ^ option));
    }
}
