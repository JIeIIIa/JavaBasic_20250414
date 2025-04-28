package com.gmail.onishchenko.lectures.lecture05;

public class TernaryDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 42;
        String result = a > b ? "TRUE" : "FALSE";
        System.out.println("result = " + result);

        if ( a > b) {
            result = "TRUE";
        } else {
            result = "FALSE";
        }
    }
}
