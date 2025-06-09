package com.gmail.onishchenko.homework.encapsulation.car;

public class Car {
    public void start() {
        System.out.println("Starting...");
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Ready to run)");
    }

    private void startElectricity() {
        System.out.println("Electricity...     ON");
    }

    private void startCommand() {
        System.out.println("Command.......     ON");
    }

    private void startFuelSystem() {
        System.out.println("Fuel System...     ON");
    }
}
