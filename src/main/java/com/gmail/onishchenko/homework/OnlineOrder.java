package com.gmail.onishchenko.homework;

public class OnlineOrder {
    public static void main(String[] args) {
        int number = 1;
        String client = "Alice";
        String product = "smartphone";
        double price = 305.99;
        String address = "Moon Street, 10";
        System.out.println("Order No " + number + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: " + address + ".");

        number = 2;
        client = "Tom";
        System.out.println("Order No " + number + " Client: " + client + ".");
        product = "laptop";
        System.out.println("Product: " + product + ",");
        price = 123.54;
        System.out.println("price EUR " + price + ".");
        address = "Terra Street, 17";
        System.out.println("Address: " + address + ".");
    }
}
