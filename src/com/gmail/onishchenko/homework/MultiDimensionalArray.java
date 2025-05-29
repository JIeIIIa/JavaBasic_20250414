package com.gmail.onishchenko.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int maxValue = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rows count: ");
        int rows = scanner.nextInt();
        System.out.print("Columns count: ");
        int columns = scanner.nextInt();

        int[][] matrix = generate(rows, columns, maxValue);
        print(matrix);

        System.out.println("Sum by even rows: " + sumRows(matrix, 0));
        System.out.println("Sum by odd rows: " + sumRows(matrix, 1));

        System.out.println("Product by even columns: " + productColumns(matrix, 0));
        System.out.println("Product by odd columns: " + productColumns(matrix, 1));

        System.out.println("Matrix is a magic square: " + isMagicSquare(matrix));
    }

    private static int[][] generate(int rows, int columns, int maxValue) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(maxValue);
            }
        }
        return matrix;
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static long sumRows(int[][] matrix, int initialRowIndex) {
        long sum = 0;
        for (int i = initialRowIndex; i < matrix.length; i += 2) {
            sum = sumByRow(matrix[i]);
        }
        return sum;
    }

    private static long sumByRow(int[] row) {
        int sum = 0;
        for (int cell : row) {
            sum += cell;
        }
        return sum;
    }

    private static long sumByColumn(int[][] matrix, int columnIndex) {
        int sum = 0;
        for (int[] row : matrix) {
            sum += row[columnIndex];
        }

        return sum;
    }

    private static long productColumns(int[][] matrix, int initialColumnIndex) {
        long result = 1;
        for (int j = initialColumnIndex; j < matrix[0].length; j += 2) {
            for (int i = 0; i < matrix.length; i++) {
                result *= matrix[i][j];
            }
        }
        return result;
    }
//
//    private static long sumEvenRows(int[][] matrix) {
//        long sum = 0;
//        for (int i = 0; i < matrix.length; i += 2) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//        }
//        return sum;
//    }
//
//    private static long sumOddRows(int[][] matrix) {
//        long sum = 0;
//        for (int i = 1; i < matrix.length; i += 2) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//        }
//        return sum;
//    }

    private static boolean isMagicSquare(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }
        long sample = sumByRow(matrix[0]);
        for (int i = 1; i < matrix.length; i++) {
            if (sample != sumByRow(matrix[i])) {
                return false;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (sample != sumByColumn(matrix, i)) {
                return false;
            }
        }

        if (sample != sumPrimary(matrix)) {
            return false;
        }

        if (sample != sumSecondary(matrix)) {
            return false;
        }

        return true;
    }

    private static long sumPrimary(int[][] matrix) {
        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }


    private static long sumSecondary(int[][] matrix) {
        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }
}
