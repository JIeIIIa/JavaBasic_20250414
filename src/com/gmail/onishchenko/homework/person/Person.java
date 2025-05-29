package com.gmail.onishchenko.homework.person;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void switchProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void describe() {
        System.out.printf("Ім'я: %s, Вік: %d, Професія: %s\n", name, age, profession);
    }
}
