package com.gmail.onishchenko.homework.printer;

public class ConsolePrinterWrapper extends ConsolePrinter {

    public static void executeStatistics() {
        System.out.println("Undefined execute statistics");
    }

    @Override
    public void print(Message message) {
        System.out.print("Wrapped method: ");
        super.print(message);
    }
}
