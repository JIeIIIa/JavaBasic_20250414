package com.gmail.onishchenko.lectures.lecture07;

public class Lecture07Demo {
    public static void main(String[] args) {
        int temperature = 3;
        int yesterdayTemperature = 12;
        int dayBeforeYesterdayTemperature = 10;

        int size = 3;

        int average = (temperature + yesterdayTemperature + dayBeforeYesterdayTemperature) / size;

        System.out.println("Average temperature == " + average);
    }
}
