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

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + getName() +
                ",age=" + getAge() +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;

        return this.getAge() == cat.getAge() && this.getName().equals(cat.getName());
    }

    @Override
    public int hashCode() {
        return 31 * getAge() + getName().hashCode();
    }
}
