package com.gmail.onishchenko.lectures.lecture10;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 46};
        print(array);

        int result = sum(array, 2, 3);
        System.out.println("result == " + result);

        sum(array, 2, 3);
    }

    public static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public static int sum(int[] array, int i, int j) {
        return array[i] + array[j];
    }
}
