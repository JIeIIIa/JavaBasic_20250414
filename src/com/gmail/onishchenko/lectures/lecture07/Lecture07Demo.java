package com.gmail.onishchenko.lectures.lecture07;

public class Lecture07Demo {
    public static void main(String[] args) {
        int[] temperatures = {3, 12, 10, 13, 15};
//        temperatures[0] = 2.34; // error
        int[] previousTemperatures = new int[1];

        print(previousTemperatures);
        print(temperatures);
        print(new int[]{1, 2, 3, 4});

        long sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        int average = (int) (sum / temperatures.length);

        System.out.println("Average temperature == " + average);
    }

    public static void print(int[] temperatures) {
        System.out.print("Temperatures: [");
        for (int temperature : temperatures) {
            System.out.print(temperature + ", ");
        }
        System.out.println("]");
    }
}
