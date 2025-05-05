package com.gmail.onishchenko.lectures.lecture06;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bound (0-1_000_000): ");
        int bound = scanner.nextInt();

        for (int currentNumber = 0; currentNumber < bound; currentNumber++) {
            System.out.println(currentNumber);
        }
        System.out.println("END)");
    }
}
