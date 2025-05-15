package com.gmail.onishchenko.lectures.lecture09;

public class MultiDimensionArray {
    public static void main(String[] args) {
        String[] lines = {"first", "second", "thirds"};
//        lines[0] = 42;
        int[][] matrix = new int[4][2];
        matrix[1][0] = 42;
        matrix[3][1] = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
