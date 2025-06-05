package com.gmail.onishchenko.lectures.lecture15;


public class Task implements Cloneable {
    private static final String[] AVAILABLE_STATUSES = {
            "TODO",
            "IN_PROGRESS",
            "DONE"
    };

    private String description;
    private Status status;
    private Person person;

    public Task(String description, Status status) {
        this.description = description;
        setStatus(status);
    }

    public Task(Task task) {
        this.status = task.status;
        this.description = task.description;
        this.person = new Person(task.getPerson().name);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", status=" + status +
                ", person=" + person +
                '}';
    }

    @Override
    public Task clone() throws CloneNotSupportedException {
        return (Task) super.clone();
    }

}
