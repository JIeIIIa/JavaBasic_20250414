package com.gmail.onishchenko.lectures.lecture09;

public class MultiDimensionArray {
    public static void main(String[] args) {
        String[] lines = {"first", "second", "thirds"};
//        lines[0] = 42;
        int[][] matrix = new int[4][2];
        matrix[1][0] = 42;
        matrix[3][1] = -1;

        for (int i = 0; i < matrix.length; i++) {
            int[] array = matrix[i];
            for (int value : array) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }


    }
}
