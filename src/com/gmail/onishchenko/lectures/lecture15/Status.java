package com.gmail.onishchenko.lectures.lecture15;

public class Status {
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
