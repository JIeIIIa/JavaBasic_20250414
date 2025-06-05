package com.gmail.onishchenko.lectures.lecture15;

public class TaskDemo {
    public static void main(String[] args) {
//        Task.Status.todo = Task.Status.done;
        Task task = new Task("Learn Java", Status.TODO);
        Task copiedTask = new Task("Learn Java", Status.IN_PROGRESS);
        System.out.println(task);
        task.setStatus(Status.DONE);
        System.out.println(task);
//        Task.Status fakeStatus = new Task.Status("FAKE STATUS"); // can't be created via private constructor
//        task.setStatus(fakeStatus);
        System.out.println(task);
    }
}
