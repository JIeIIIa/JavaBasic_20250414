package com.gmail.onishchenko.homework.person;

public class PersonRunner {
    public static void main(String[] args) {
        Person john = new Person("John", 30, "Інженер");
        Person mary = new Person("Mary", 25, "Вчитель");
        Person bob = new Person("Bob", 35, "Лікар");

        john.describe();
        mary.describe();
        bob.describe();

        System.out.println();
        Person alice = new Person("Alice", 28, "Архітектор");
        alice.describe();
        alice.switchProfession("Дизайнер");
        alice.describe();
    }
}
