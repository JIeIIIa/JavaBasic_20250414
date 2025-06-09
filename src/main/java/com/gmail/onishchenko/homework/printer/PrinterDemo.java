package com.gmail.onishchenko.homework.printer;

public class PrinterDemo {
    public static void main(String[] args) {
        ConsolePrinter.executeStatistics();
        ConsolePrinter.Message[] messages = {
                new ConsolePrinter.Message("Santa Clause", "Ho-ho-ho"),
                new ConsolePrinter.Message("", "Ho-ho-ho"),
                new ConsolePrinter.Message(null, "Ho-ho-ho"),
                new ConsolePrinter.Message("Peter Parker", ""),
                new ConsolePrinter.Message("Peter Parker", null),
                new ConsolePrinter.Message(null, null),
                new ConsolePrinter.Message("", ""),
        };

        ConsolePrinterWrapper printer = new ConsolePrinterWrapper();
        for (ConsolePrinter.Message message : messages) {
            printer.print(message);
        }

        printer.executeStatistics();
    }
}
