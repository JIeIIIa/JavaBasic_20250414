package com.gmail.onishchenko.lectures.lecture15;

public enum Status implements Runnable {
    TODO(1000),
    IN_PROGRESS(42),
    DONE {
        private int value = 42;

        @Override
        public void run() {
            printText();
        }

        private void printText() {
            System.out.println("Already completed");
        }
    };

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

    @Override
    public void run() {
        System.out.println("Running a task is status " + name());
    }
}
