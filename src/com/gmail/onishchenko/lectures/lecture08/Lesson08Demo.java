package com.gmail.onishchenko.lectures.lecture08;

public class Lesson08Demo {
    public static void main(String[] args) {
        int[] array = {10, 8, 7, 3, 1, 4};
        print(array);
        bubbleSort(array);
        System.out.println("Bubble sort");
        print(array);
    }

    /**
     * O(1)
     */
    public static int sumPair(int a, int b) {
        return a + b;
    }


    /**
     * O(1)
     */
    public static int sumPair2(int a, int b, int c) {
        return a + b + c;
    }


    /*
     * O(N)
     * */
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }


    /**
     * O(N) = 4*N ~ N
     */
    public static void demo1() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * З точки зору команд процесораа, цей варіант повільніший
     * Але BigO демонструє як себе поводить алгоритм
     * O(N)
     */

    public static void demo2() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * O(N)
     */
    // f(n) = n
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    /**
     * O(N)
     */
    // g(n) == n + g(n-1);
    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursion(n - 1);
        }
    }

    /**
     * O(N) = 2*N ~ N
     */
    public static int sum2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sumPair2(i, i + 1, 1);
        }
        return sum;
    }

    /*
     * O(N*N)
     * */
    public static void bubbleSort(int[] array) {
        int step = 0;
        System.out.println("STARTING bubble sorting");
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                step++;
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
            print(array);
            System.out.println();
        }
        System.out.println("END bubble sorting");
        System.out.println("step = " + step);
    }
}
