package com.gmail.onishchenko.lectures.lecture13;

public class Cat extends Animal implements Runnable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    public void describe() {
        System.out.println("I'm a cat. My name is " + getName());
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
