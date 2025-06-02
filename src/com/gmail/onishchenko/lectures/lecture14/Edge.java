package com.gmail.onishchenko.lectures.lecture14;

@FunctionalInterface
public interface Edge {
    int getLength();

    default String getColor() {
        return "black";
    }
}
