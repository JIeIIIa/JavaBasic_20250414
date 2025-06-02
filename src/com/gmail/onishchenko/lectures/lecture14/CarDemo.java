package com.gmail.onishchenko.lectures.lecture14;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Audi", "blue");
        System.out.println(car);
//        Car.Engine engine = new Car.Engine("bw-007", 2025);
        Car.Engine engine = car.new Engine("bw-007", 2025);
        car.setEngine(engine);
        System.out.println(car);
        engine.detailedStatistics();
    }
}
