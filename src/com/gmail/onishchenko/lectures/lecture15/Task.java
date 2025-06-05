package com.gmail.onishchenko.lectures.lecture15;


public class Task {
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

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Status {
        public static final Status TODO = new Status("TODO");
        public static final Status IN_PROGRESS = new Status("IN_PROGRESS");
        public static final Status DONE = new Status("DONE");


        private String status;

        private Status(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return status;
        }
    }
}
