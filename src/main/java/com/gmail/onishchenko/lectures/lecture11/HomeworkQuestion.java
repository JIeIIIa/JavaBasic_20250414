package com.gmail.onishchenko.lectures.lecture11;

import java.util.Scanner;

public class HomeworkQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        while (true) {
            System.out.print("Введіть довжину масиву: ");
            String input = scanner.nextLine();
            try {
                length = Integer.parseInt(input);
                if (length <= 0) {
                    System.out.println("Помилка: довжина масиву повинна бути більше 0.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введіть ціле число.");
            }
        }
    }
}
