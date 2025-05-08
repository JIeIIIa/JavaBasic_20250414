package com.gmail.onishchenko.lectures.lecture07;

public class Greeting {
    public static void main(String[] args) {
        print(args);

        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "anonymous";
        }
        System.out.println("Hello, " + name);
    }

    public static void print(String[] args) {
        System.out.println("Income arguments:");
        for (String element : args) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }
}
