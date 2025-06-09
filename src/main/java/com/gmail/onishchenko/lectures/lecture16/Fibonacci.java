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
        if(n <= 0) {
            throw new IllegalArgumentException();
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int result = Fibonacci.fibonacci(5);
        System.out.println("Fibonacci(6) = " + result);
    }
}
