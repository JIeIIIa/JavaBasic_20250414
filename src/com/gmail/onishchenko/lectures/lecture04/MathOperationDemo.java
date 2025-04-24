package com.gmail.onishchenko.lectures.lecture04;

public class MathOperationDemo {
    public static void main(String[] args) {
//        simpleMathOperations();
        increments();


    }

    private static void increments() {
        int a = 10;
        int b = 6;
        a %= b;
        System.out.println("a = " + a);

        a += 1;
        a++;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        System.out.println(" -= INCREMENTS =-");
        a = 10;
        b = 2;
        int result = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);

        result = 13; // 14
        a = 1;       // 2
        b = 5;       // 6
        result = result++ + ++a - b++; // 13 + 2 - 5 == 10

        System.out.println("result = " + result);
        result--;
        System.out.println("result = " + result);
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
