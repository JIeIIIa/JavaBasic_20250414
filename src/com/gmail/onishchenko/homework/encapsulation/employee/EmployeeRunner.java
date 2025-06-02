package com.gmail.onishchenko.homework.encapsulation.employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Peter Parker", "spider man", "parker@email.com", "777-77-771", 26);
        System.out.println("Name: " + employee.getName());
        System.out.println(employee);
        System.out.println("Change position");
        employee.setPosition("photographer");
        System.out.println("New positions is " + employee.getPosition());
        System.out.println(employee);
    }
}
