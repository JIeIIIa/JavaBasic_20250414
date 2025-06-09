package com.gmail.onishchenko.lectures.lecture10;

public class StringDemo {
    public static void main(String[] args) {
        String line = "abcdefg";

        System.out.println("Length == " + line.length());
        System.out.println("Character at position 3: " + line.charAt(3));

        char[] charArray = line.toCharArray();
        System.out.println("charArray.length == " + charArray.length);

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String anotherLine = new String(chars);

        System.out.println("Reverse (DO NOT USE!)");
        StringBuilder stringBuilder = new StringBuilder(line);
        System.out.println(stringBuilder.reverse());
    }
}
