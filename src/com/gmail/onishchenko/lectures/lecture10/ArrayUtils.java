package com.gmail.onishchenko.lectures.lecture10;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 46};
        print(array);

        int result = sum(array, 2, 3);
        System.out.println("result == " + result);

        sum(array, 2, 3);

        array = null;
//        print(array);
        print(null);
        int[] emptyArray = {};
        print(emptyArray);
        print(new int[0]);
        print(new int[]{1, 5, 2, 46});
    }

    public static void print(int[] array) {
        if (array == null) {
            System.out.println("Array is null");
            return;
        } else if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public static int sum(int[] array, int i, int j) {
        return array[i] + array[j];
    }
}
