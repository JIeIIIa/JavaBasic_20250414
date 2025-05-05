package com.gmail.onishchenko.lectures.lecture06;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bound (0-1_000_000): ");
        int bound = scanner.nextInt();

        for (int currentNumber = 0; currentNumber < 1_000_001; currentNumber++) {
            if (currentNumber < bound) {
                System.out.println(currentNumber);
            }
        }
    }


}
