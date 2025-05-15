package com.gmail.onishchenko.lectures.lecture09;

import java.util.Random;

public class Lecture09Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        print(array);

        System.out.println("-= Linear search =-");
        int target = 34;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Found at position: " + i);
                break;
            }
        }
        System.out.println("-= Linear search =-");

        System.out.println("-= Bubble sort =-");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        print(array);
        System.out.println("-= Bubble sort =-");

        System.out.println("-= Binary search =-");
        target = 47;
        int index = binarySearch(array, target);
        System.out.println("Element found at " + index);

        System.out.println("-= Binary search =-");
    }

    private static void print(int[] array) {
        System.out.print("[");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println("]");
    }


    /*
    *  8
    *  4
    *  2
    *  1
    *
    * log2(length)
    * O(logN)
    * */
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target == array[middle]) {
                return middle;
            } else if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
