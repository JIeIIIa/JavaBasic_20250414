package com.gmail.onishchenko.lectures.lecture13;

public class Person implements Runnable {
    @Override
    public void run() {
        System.out.println("Person is running");
    }
}
