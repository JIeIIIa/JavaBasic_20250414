package com.gmail.onishchenko.lectures.lecture15;

public class Task {
    private String description;
    private String status;

    public Task(String description, String status) {
        this.description = description;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
