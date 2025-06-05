package com.gmail.onishchenko.lectures.lecture15;


public class Task implements Cloneable {
    private static final String[] AVAILABLE_STATUSES = {
            "TODO",
            "IN_PROGRESS",
            "DONE"
    };

    private String description;
    private Status status;

    public Task(String description, Status status) {
        this.description = description;
        setStatus(status);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public Task clone() throws CloneNotSupportedException {
        return (Task) super.clone();
    }

}
