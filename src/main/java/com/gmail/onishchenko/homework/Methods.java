package com.gmail.onishchenko.homework;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Methods {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        fillArray(array);
        System.out.println(Arrays.toString(array));

        String line = "Hello World)";
        System.out.println("Reversed string:");
        System.out.println(reverse(line));
        System.out.println(reverseVersion2(line));
        System.out.println(reverseVersion3(line));

        System.out.println("Power");
        System.out.println(power(2, -3));
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }
    }

    public static void printSquare(int number) {
        System.out.println("Square is " + (number * number));
    }

    public static int square(int number) {
        return number * number;
    }

    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int element : array) {
            result += element;
        }

        return result;
    }

    public static String reverse(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            result = line.charAt(i) + result;
        }

        return result;
    }

    public static String reverseVersion2(String line) {
        char[] chars = line.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < line.length(); i++) {
            result[i] = chars[chars.length - 1 - i];
        }

        return new String(result);
    }


    public static String reverseVersion3(String line) {
        char[] chars = line.toCharArray();

        for (int i = 0; i < line.length() / 2; i++) {
            char tmp = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = chars[i];
            chars[i] = tmp;
        }

        return new String(chars);
    }

    public static double power(int base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        if(exponent < 0) {
            result = 1.0 / result;
        }

        return result;
    }

    public static void print(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}
