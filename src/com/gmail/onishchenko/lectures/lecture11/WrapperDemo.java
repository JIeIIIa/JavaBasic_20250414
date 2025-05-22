package com.gmail.onishchenko.lectures.lecture11;

public class WrapperDemo {
    public static void main(String[] args) {
        System.out.println("Integer max value == " + Integer.MAX_VALUE);
        int value = 42;
        Integer wrappedValue = new Integer(42);
        System.out.println("Wrapped value " + wrappedValue);

        Integer result = new Integer(wrappedValue.intValue() * 10);
        System.out.println("result = " + result);
    }
}
