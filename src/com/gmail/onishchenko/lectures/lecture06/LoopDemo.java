package com.gmail.onishchenko.lectures.lecture06;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bound (0-1_000_000): ");
        int bound = scanner.nextInt();

        int i = 0;
        for (; ;) {
            if (!(i < bound)) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("END)");
    }
}
