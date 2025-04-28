package com.gmail.onishchenko.lectures.lecture05;

public class RelationalDemo {
    public static void main(String[] args) {
        int a = 120;
        int b = 20;

        boolean result = a > b;
        System.out.printf("a(%d) > b(%d) is %b\n", a, b, result);

        result = a < b;
        System.out.printf("a(%d) < b(%d) is %b\n", a, b, result);

//        long c = 0;
//        c = b = a;
        result = b == a;
        System.out.printf("a(%d) = b(%d) is %b\n", a, b, result);

        result = a <= b;
        System.out.printf("a(%d) <= b(%d) is %b\n", a, b, result);

        result = a >= b;
        System.out.printf("a(%d) >= b(%d) is %b\n", a, b, result);

        result = a != b;
        System.out.printf("a(%d) != b(%d) is %b\n", a, b, result);
    }
}
