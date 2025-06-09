package com.gmail.onishchenko.lectures.lecture13;

public abstract class Animal extends Object {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void say();

    public void describe() {
        System.out.println("I'm a cat. My name is " + getName());
    }
}
