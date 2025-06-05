package com.gmail.onishchenko.lectures.lecture15;

public class TaskDemo {
    public static void main(String[] args) {
//        Task.Status.todo = Task.Status.done;
        Status.TODO.setDefaultDuration(777);
        Task task = new Task("Learn Java", Status.TODO);
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

    }
}
