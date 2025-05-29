package com.gmail.onishchenko.lectures.lecture13;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Filex", 3),
                new Dog("Friend", 10),
//                new Animal("UNKNOWN", -1) // can't be instantiated
        };

        for (Animal animal : animals) {
            animal.say();
            if (animal instanceof Cat cat) {
                ((Cat) animal).describe();
                cat.describe();
            }
        }
    }
}
