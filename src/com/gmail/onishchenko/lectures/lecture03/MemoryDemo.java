package com.gmail.onishchenko.lectures.lecture03;

public class MemoryDemo {
    private int counter;

    public static void doSomething(MemoryDemo memoryDemo) {
        // todo: extract method
        String line = "Do work...";
        System.out.println(line);
//        String text = new String("Do work...");
        String text = "Do work...";
        text = "another value";
        int value = -1;
        System.out.println("value = " + value);
    }

    public static void main(String[] args) {
        int value = 42;
        MemoryDemo memoryDemo = new MemoryDemo();
        doSomething(memoryDemo);
        System.out.println("value = " + value);
    }
}
