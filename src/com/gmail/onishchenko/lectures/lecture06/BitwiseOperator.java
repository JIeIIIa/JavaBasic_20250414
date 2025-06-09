package com.gmail.onishchenko.lectures.lecture06;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 6;              // 0110
        int b = 3;              // 0011

        int result = a | b;     // 0111 == 7
        System.out.printf("%d | %d == %d\n", a, b, result);

        result = a & b;         // 0010 == 2
        System.out.printf("%d & %d == %d\n", a, b, result);

        result = ~a;
        System.out.printf("~%d == %d\n", a, result);
        System.out.println("a:  " + Integer.toBinaryString(a));
        System.out.println("result:  " + Integer.toBinaryString(result));

        result = a ^ b;         // 0101 == 5
        System.out.printf("%d ^ %d == %d\n", a, b, result);

        result = a >> 1; // 0110 >> 1 == 0011
        System.out.printf("%d >> 1 == %d\n", a, result);
        a = 6;
        result = a >> 2; // 000000000000000110 >> 2 == 0001
        System.out.printf("%d >> 2 == %d\n", a, result);

        a = -3;
        System.out.println(a + " == " + Integer.toBinaryString(a));
        result = a >> 1;
        System.out.println(result + " == " + Integer.toBinaryString(result));
        System.out.printf("%d >> 1 == %d\n", a, result);


        a = -3;
        System.out.printf("%20d == %35s\n", a, Integer.toBinaryString(a));
        result = a >>> 2;
        System.out.printf("%20d == %35s\n", result, Integer.toBinaryString(result));
        System.out.printf("%d >> 2 == %d\n", a, result);

        a = -3;
        System.out.println(a + " == " + Integer.toBinaryString(a));
        result = a << 1;
        System.out.println(result + " == " + Integer.toBinaryString(result));
        System.out.printf("%d << 1 == %d\n", a, result);


        a = 1073741823;
        System.out.printf("%20d == %35s\n", a, Integer.toBinaryString(a));
        result = a << 2;
        System.out.printf("%20d == %35s\n", result, Integer.toBinaryString(result));
        System.out.printf("%d << 2 == %d\n", a, result);
    }
}
