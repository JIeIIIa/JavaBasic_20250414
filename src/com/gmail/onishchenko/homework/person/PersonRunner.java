package com.gmail.onishchenko.homework.person;

public class PersonRunner {
    public static void main(String[] args) {
        Person[] persons = {new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар"),
                new Person("Alice", 28, "Архітектор")
        };

        for (Person person : persons) {
            person.describe();
        }

        System.out.println();
        persons[3].describe();
        persons[3].switchProfession("Дизайнер");
        persons[3].describe();
    }
}
