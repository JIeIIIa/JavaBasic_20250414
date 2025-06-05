package com.gmail.onishchenko.lectures.lecture15;


public class Task {
    private static final String[] AVAILABLE_STATUSES = {
            "TODO",
            "IN_PROGRESS",
            "DONE"
    };

    private String description;
    private String status;

    public Task(String description, String status) {
        this.description = description;
        setStatus(status);
    }

    public void setStatus(String status) {
        validate(status);
        this.status = status;
    }

    private void validate(String status) {
        for (String availableStatus : AVAILABLE_STATUSES) {
            if (availableStatus.equals(status)) {
                return;
            }
        }
        throw new RuntimeException("Wrong status: " + status);
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
