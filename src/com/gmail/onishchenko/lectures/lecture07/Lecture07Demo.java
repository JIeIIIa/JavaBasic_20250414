package com.gmail.onishchenko.lectures.lecture07;

public class Lecture07Demo {
    public static void main(String[] args) {
        int[] temperatures = new int[5];
        temperatures[0] = 3;
        temperatures[1] = 12;
        temperatures[2] = 10;
        temperatures[3] = 13;
        temperatures[4] = 15;

        long sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        int average = (int) (sum / temperatures.length);

        System.out.println("Average temperature == " + average);
    }
}
