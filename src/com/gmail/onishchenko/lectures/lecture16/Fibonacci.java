package com.gmail.onishchenko.lectures.lecture16;

public class Fibonacci {

    /*
     * #1 - 1
     * #2 - 1
     * #3 - 2
     * #4 - 3
     * #5 - 5
     * #6 - 8
     *
     * #f(n) = f(n-1) + f(n-2)
     * */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Wrong n value: " + n);
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int previous = 1;
        int step = 3;
        int current = 2;
        while (step < n) {
            int tmp = current;
            current = current + previous;
            previous = tmp;
            step++;
        }

        return current;
    }

    public static void main(String[] args) {
        int result = Fibonacci.fibonacci(5);
        System.out.println("Fibonacci(6) = " + result);
    }
}
