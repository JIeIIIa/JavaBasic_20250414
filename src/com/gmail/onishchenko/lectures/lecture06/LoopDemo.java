package com.gmail.onishchenko.lectures.lecture06;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
//        forDemo1();
        forDemo2();
    }

    private static void forDemo2() {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 1; j < 10; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }

    private static void forDemo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bound (0-1_000_000): ");
        int bound = scanner.nextInt();

        int i = 0;
        for (; ; ) {
            if (!(i < bound)) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("END)");
    }
}
