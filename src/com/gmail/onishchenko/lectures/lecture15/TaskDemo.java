package com.gmail.onishchenko.lectures.lecture15;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task("Learn Java", "IN_PROGRESS");
        System.out.println(task);
        task.setStatus("DONE");
        System.out.println(task);
        task.setStatus("FAKE STATUS");
        System.out.println(task);
    }
}
