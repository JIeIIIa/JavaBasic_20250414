package com.gmail.onishchenko.lectures.lecture10;

/*
* a * x + b == 0
*
* root == -b / a
* */
public class LinearEquationSolver {
    public static void main(String[] args) {
        System.out.println("x + 10 == 0");
        double root = findRoot(1, 10);
        System.out.println("root == " + root);

        System.out.println();
        System.out.println("3 * x + 10 == 0");
        root = findRoot(3, 10);
        System.out.println("root == " + root);
    }

    public static double findRoot(int a, int b) {
        return -1.0 * b / a;
    }
}
