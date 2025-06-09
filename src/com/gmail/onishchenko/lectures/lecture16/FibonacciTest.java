package com.gmail.onishchenko.lectures.lecture16;

public class FibonacciTest {
    public static void main(String[] args) {
        int result = Fibonacci.fibonacci(1);
        System.out.println("f(1) is 1. Actual is " + result);
        result = Fibonacci.fibonacci(3);
        System.out.println("f(3) is 3. Actual is " + result);
        result = Fibonacci.fibonacci(6);
        System.out.println("f(6) is 8. Actual is " + result);
    }
}
