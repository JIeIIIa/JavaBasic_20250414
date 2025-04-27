package com.gmail.onishchenko.lectures.lecture04;

import java.util.Scanner;

public class MathOperationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(a + b);
        String line = scanner.nextLine();
        System.out.println("line = " + line);

//        simpleMathOperations();
//        increments();
        a = 123.543;
        double result = Math.round(100 * a) / 100.0;
        System.out.println("round(a) == " + result);
        System.out.println(Math.round(123.5));

        a = 398457.39443;
        System.out.printf("Rounded value == %15.1f\n", a);
//        System.out.println();
        String text = "constant" + 1;
        System.out.printf("Some text = %20s\n", text);
        System.out.printf("%s: %d\n", "Integers", 42);
        System.out.println("Good bye:)");
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
