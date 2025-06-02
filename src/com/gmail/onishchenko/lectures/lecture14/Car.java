package com.gmail.onishchenko.lectures.lecture14;

public class Car {
    private String model;
    private String color;
    private Engine engine;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, Engine engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private String model;
        private int year;

        public Engine(String model, int year) {
            this.model = model;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    '}';
        }
    }
}
