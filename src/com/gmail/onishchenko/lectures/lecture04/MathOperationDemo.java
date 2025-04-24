package com.gmail.onishchenko.lectures.lecture04;

public class MathOperationDemo {
    public static void main(String[] args) {
        simpleMathOperations();
    }

    private static void simpleMathOperations() {
        int a = 10;
        int b = 6;
        double result = a + b;
        System.out.println("a + b = " + result);

        result = a - b;
        System.out.println("a - b = " + result);

        result = a * b;
        System.out.println("a * b = " + result);


        result = a / b;
//        result = 1.0 * a / b;
//        result = a / ((double) b);
        System.out.println("a / b = " + result);

        int reminder = a - a / b * b;
        System.out.println("reminder = " + reminder);
        int anotherReminder = a % b;
        System.out.println("anotherReminder = " + anotherReminder);
    }
}
