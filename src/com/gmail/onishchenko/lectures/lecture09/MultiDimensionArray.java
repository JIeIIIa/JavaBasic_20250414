package com.gmail.onishchenko.lectures.lecture09;

public class MultiDimensionArray {
    public static void main(String[] args) {
        twoDimArraySecond();
//        threeDimArray();
    }

    private static void threeDimArray() {
        int[][][] cube = new int[3][5][10];
        cube[1][4][5] = 42;

        System.out.println("Print cube [START]");
        for (int k = 0; k < cube.length; k++) {
            System.out.println("Slice #" + k);
            int[][] matrix = cube[k];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("Print cube [END]");
    }

    private static void twoDimArraySecond() {
//        lines[0] = 42;
        int[][] matrix = new int[][]{
                {0, 1, 2},
                {3, 4, 5, 10, 11, 12},
                {},
                null,
                {6, 7, 8}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; matrix[i] != null && j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void twoDimArray() {
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
