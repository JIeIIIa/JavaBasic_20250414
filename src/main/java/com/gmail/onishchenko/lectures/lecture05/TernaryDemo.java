package com.gmail.onishchenko.lectures.lecture05;

public class TernaryDemo {
    public static void main(String[] args) {
        int a = -50;
        int b = 42;
        String result = a > b ?
                a > 100 ? "more then 100" : "TRUE" :
                a < 0 ? "FALSE" : "between 0 and 42";
        System.out.println("result = " + result);

        if (a > b) {
            result = "TRUE";
        } else {
            result = "FALSE";
        }
    }
}
