package com.gmail.onishchenko.lectures.lecture12;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Tony Stark", "0001");
        employee.checkIn();
        System.out.println("8 hours later...");
        employee.checkOut();

        Employee anotherEmployee = new Employee("Hulk", "0002");
        anotherEmployee.checkIn();

        Security spiderMan = new Security("Spider man", "0003");
        spiderMan.checkIn();
        spiderMan.validateVisitor();
        spiderMan.checkOut();

        Accounter accounter = new Accounter("Top accounter", "0003");
        accounter.checkIn();
        accounter.makeReport();
        accounter.checkOut();
        accounter.describe();
    }
}
