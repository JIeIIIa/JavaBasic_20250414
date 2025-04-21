package com.gmail.onishchenko.lectures.lecture02;

public class Lecture02Demo {

    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean flag = false;
        System.out.println(flag);


        System.out.println(" -= BYTE =-");
        byte numberValue = 127;
        System.out.println("number = " + numberValue);
        numberValue += 1;
        System.out.println("number = " + numberValue);
        byte value = 1;
        numberValue = 127;
        byte byteResul = (byte) (numberValue + value); // explicit casting or  down cast
        System.out.println("byteResul = " + byteResul);


        System.out.println("-= INTEGER =-");
        int a = 10;
        int b = 4;
        int result = a / b;
        System.out.println("result = " + result);

        a = 123;
        a = a + 1;
        System.out.println("a = " + a);
        a += 10 / 2 - 4;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        a = numberValue + value; // up casting or implicit casting

        a = 16;
        System.out.println(a);
        a = 0b10000;
        System.out.println("a = " + a);
        a = 0x10;
        System.out.println("a = " + a);
        a = 020;
        System.out.println("a = " + a);

        long big = 298347598746551111L;

        // double d = 12837.34, pi = 3.1415, e;
        double d = 12837.34;
        double pi = 3.1415;
        double e;
        float f = 1.234F, f1 = 0.1F;
        f1 = 10 * f1;
        float f2 = 0;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;
        f2 = f2 + 0.1F;

        System.out.println(f1 + " == " + f2);

        char ch = 'A';
        System.out.println("ch = " + ch);
        ch += 1;
        System.out.println("ch = " + ch);
        System.out.println("ch = " + ((int) ch));
        ch = '\u0042';
        System.out.println("ch = " + ch);

        String line = "some text";
        System.out.println(line);
        line = line + (1 + 2 + 3);
        System.out.println("line is:" + line);
        line = "123.skldjf45";
        d = Double.valueOf(line);
        System.out.println("d = " + d);

    }
}

