package com.gmail.onishchenko.lectures.lecture15;

import java.util.Scanner;

public class TaskDemo {
    public static void main(String[] args) {
//        Task.Status.todo = Task.Status.done;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial status: ");
        String line = scanner.nextLine();
        Status status = convertToStatus(line);
//        Status status = Status.valueOf(line.toUpperCase());

        Status.TODO.setDefaultDuration(777);
        Task task = new Task("Learn Java", status);
        System.out.println(task);
        task.getStatus().run();
        System.out.println("Task default duration: " + task.getStatus().getDefaultDuration());

        task.setStatus(Status.DONE);
        System.out.println(task);
        System.out.println("Task default duration: " + task.getStatus().getDefaultDuration());
//        Task.Status fakeStatus = new Task.Status("FAKE STATUS"); // can't be created via private constructor
//        task.setStatus(fakeStatus);
        System.out.println(task);
        task.getStatus().run();

        System.out.println();
        System.out.println(Status.IN_PROGRESS);


        switch (status) {
            case DONE -> {
                System.out.print("All ");
                System.out.println("done");
            }
            case TODO -> System.out.println("Be ready");
            default -> System.out.println("Unknown behavior");
        }
    }

    private static Status convertToStatus(String text) {
        Status[] values = Status.values();
        for (Status value : values) {
            if (value.name().equalsIgnoreCase(text)) {
                return value;
            }
        }

        return null;
    }
}
