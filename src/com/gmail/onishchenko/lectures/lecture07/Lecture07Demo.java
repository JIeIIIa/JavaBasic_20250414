package com.gmail.onishchenko.lectures.lecture07;

public class Lecture07Demo {
    public static void main(String[] args) {
        int[] temperatures = new int[3];
        temperatures[0] = 3;
        temperatures[1] = 12;
        temperatures[2] = 10;

        int average = (temperatures[0] + temperatures[1] + temperatures[2]) / temperatures.length;

        System.out.println("Average temperature == " + average);
    }
}
