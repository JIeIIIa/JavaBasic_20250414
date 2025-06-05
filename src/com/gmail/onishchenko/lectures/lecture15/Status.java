package com.gmail.onishchenko.lectures.lecture15;

public enum Status {
    TODO(1000),
    IN_PROGRESS(42),
    DONE;

    private int defaultDuration;

    Status() {
        this.defaultDuration = -1;
    }

    Status(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    public int getDefaultDuration() {
        return defaultDuration;
    }

    public void setDefaultDuration(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }
}
