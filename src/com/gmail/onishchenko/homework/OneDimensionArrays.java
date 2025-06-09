package com.gmail.onishchenko.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OneDimensionArrays {
    public static void main(String[] args) {
//        int size = readInt();
        int size = 10;
        int[] array = generateArray(size);
        print(array);
        int sum = negativeSum(array);
        System.out.println("Sum for elements less than zero == " + sum);

        evenAndOddCounts(array);
        maxMinStatistics(array);

        sumAfterFirstNegative(array);
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            if (size < 0) {
                System.out.println("Wrong length(((");
            }
            System.out.print("Enter an array length: ");
            size = scanner.nextInt();
        } while (size < 0);
        return size;
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }
        return array;
    }

    private static void print(int[] array) {
        System.out.print("[");
        if (array.length > 0) {
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            System.out.print(", " + element);
        }
        System.out.println("]");
    }

    private static int negativeSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }
        return sum;
    }

    private static void evenAndOddCounts(int[] array) {
        int evenCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        System.out.printf("Even count == %d, odd count == %d\n", evenCount, array.length - evenCount);
    }

    private static void maxMinStatistics(int[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        System.out.printf("max element == %d and has index %d\n", array[maxIndex], maxIndex);
        System.out.printf("min element == %d and has index %d\n", array[minIndex], minIndex);
    }

    private static void sumAfterFirstNegative(int[] array) {
        int index = 0;
        while (index < array.length && array[index] >= 0) {
            index++;
        }
        System.out.println("index == " + index);
        if (index >= array.length) {
            System.out.println("No negative elements!!!");
        } else {
            int sum = 0;
            for (int i = index + 1; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Sum of elements after the first negative == " + sum);
            if (index == array.length - 1) {
                System.out.println("No elements after the first negative");
            } else {
                double average = (double) sum / (array.length - index - 1);
                System.out.println("Average == " + average);
            }
        }
    }
}
