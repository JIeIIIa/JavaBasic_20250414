package com.gmail.onishchenko.lectures.lecture13;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat("Filex", 3);
        cat.say();

        Dog dog = new Dog("Friend", 10);
        dog.say();
    }
}
