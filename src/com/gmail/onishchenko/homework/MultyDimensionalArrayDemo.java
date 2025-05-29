package com.gmail.onishchenko.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultyDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Sum by even rows: " + sumRows(matrix, 0));
        System.out.println("Sum by odd rows: " + sumRows(matrix, 1));
//
//        System.out.println("Product by even columns: " + productEvenColumns(matrix));
//        System.out.println("Product by odd columns: " + productOddColumns(matrix));
//
//        System.out.println("Matrix is a magic square: " + isMagicSquare(matrix));
    }

    private static int sumEvenRows(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int sumOddRows(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i+=2) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];

            }
        }
        return sum;
    }

    private static int sumRows(int[][] matrix, int initialRowNumber) {
        int sum = 0;
        for (int i = initialRowNumber; i < matrix.length; i += 2) {
            sum += sumByRow(matrix, i);
        }
        return sum;
    }

    private static int sumByRow(int[][] matrix, int rowNumber) {
        int sum = 0;
        for (int j = 0; j < matrix[rowNumber].length; j++) {
            sum += matrix[rowNumber][j];
        }
        return sum;
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
}
