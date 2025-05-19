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
        print((int[]) null);
        int[] emptyArray = {};
        print(emptyArray);
        print(new int[0]);
        print(new int[]{1, 5, 2, 46});

        System.out.println();
        System.out.println("Modify parameters inside a method");
        array = new int[]{1, 5, 2, 46};
        int index = -1;
        System.out.print("array: ");
        print(array);
        System.out.println("index = " + index);
        modify(array, index);
        System.out.print("array: ");
        print(array);
        System.out.println("index = " + index);

        System.out.println();
        print("qwerty");
        print("qwerty", "asd");
        print(new String[]{"qwerty", "asd", "zxc"});
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

    public static void modify(int[] array, int index) {
        System.out.println("Modify parameters");
        index = 42;
        array = new int[100];
//        array[0] = -1000;
        System.out.println("Modified data");
        System.out.println(" >> index = " + index);
        System.out.print(" >> array");
        print(array);

    }

    public static void print(String line) {
        System.out.println("One parameter");
        System.out.println(line);
    }

    public static void print(String line, String secondLine) {
        System.out.println("Two parameter");
        System.out.println(line);
        System.out.println(secondLine);
    }

    public static void print(String[] lines) {
        System.out.println("Array as parameter");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
