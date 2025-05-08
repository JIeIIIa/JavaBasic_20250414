package com.gmail.onishchenko.lectures.lecture07;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println(" -= RANDOM =-");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10000, 10000);
            System.out.println(array[i]);
        }

        System.out.println(" -= ThreadLocalRandom =-");
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-10000, 10000);
            System.out.println(array[i]);
        }

    }
}
