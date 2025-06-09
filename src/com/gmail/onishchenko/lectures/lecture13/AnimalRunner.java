package com.gmail.onishchenko.lectures.lecture13;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat("Filex", 3);
        Animal[] animals = {cat,
                new Dog("Friend", 10),
//                new Animal("UNKNOWN", -1) // can't be instantiated
        };

        for (Animal animal : animals) {
            animal.say();
            if (animal instanceof Cat createdCat) {
                ((Cat) animal).describe();
                createdCat.describe();
            }
        }
        doRun(cat);
        doRun(new Person());

        String string = cat.toString();
        System.out.println(string);
        System.out.println(cat);

//        Cat copiedCat = new Cat("Filex", 3);
        Cat copiedCat = null;
//        Cat copiedCat = cat;
        if (cat.equals(copiedCat)) {
            System.out.println("Cats are equal");
        } else {
            System.out.println("Cats are NOT equal");
        }

//        cat = null;
        boolean result = cat.equals(null);
        System.out.println("result == " + result);
    }

    public static void doRun(Runnable runnable) {
        runnable.run();
    }
}
