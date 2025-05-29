package com.gmail.onishchenko.lectures.lecture13;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
