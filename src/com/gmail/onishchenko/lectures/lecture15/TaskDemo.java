package com.gmail.onishchenko.lectures.lecture15;

import java.util.Scanner;

public class TaskDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Task.Status.todo = Task.Status.done;
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial status: ");
//        String line = scanner.nextLine();
        String line = "DONE";
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
        System.out.println();
        System.out.println("CLONE TASK");
        Person worker = new Person("Worker");
        task.setPerson(worker);
        Task clonedTask = task.clone();
        Task copiedTask = new Task(task);

        task.getPerson().name = "NEW NAME";

        System.out.println("Original object: " + task);
        System.out.println("Cloned   object: " + clonedTask);
        System.out.println("Copied   object: " + copiedTask);
        if (task == clonedTask) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are NOT equal");
        }
        System.out.println("Cloned task status: " + clonedTask.getStatus());

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
