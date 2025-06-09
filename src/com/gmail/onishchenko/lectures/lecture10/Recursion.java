package com.gmail.onishchenko.lectures.lecture10;

public class Recursion {
    /*
    * n! == 1 * 2 * ... * (n-1) * n == (1 * 2 * ... * (n-1)) * n == (n-1)! * n
    * 0! == 1
    * */
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.printf("%d! == %d", n, result);

        System.out.println("\n -= Recursion =-");
        result = recursiveFactorial(n);
        System.out.printf("%d! == %d", n, result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = recursiveFactorial(n - 1) * n;
        return result;
    }
}
