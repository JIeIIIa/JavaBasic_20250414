package com.gmail.onishchenko.lectures.lecture11;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
        System.out.println("Integer max value == " + Integer.MAX_VALUE);
        int value = 42;
        Integer wrappedValue = new Integer(42);
        System.out.println("Wrapped value " + wrappedValue);

        Integer result = new Integer(wrappedValue.intValue() * 10);
        System.out.println("result = " + result);

        demo();
    }

    public static void demo() {
        System.out.println("DEMO");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(42);
//        list.add(42.0);
//        list.add("bad value");

        for (Object object : list) {
            System.out.println(object);
        }

        int sum = 0;
        for (Object object : list) {
            sum += ((Integer) object).intValue();
        }
    }
}
