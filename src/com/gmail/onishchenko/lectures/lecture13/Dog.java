package com.gmail.onishchenko.lectures.lecture13;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Woof-woof");
    }
}
