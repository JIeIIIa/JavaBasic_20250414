package com.gmail.onishchenko.homework;

public class Sales {
    public static void main(String[] args) {
        int number = 1;
        String productName = "smartphone";
        int days = 5;
        double totalPrice = 12153.41;
        printStatistics(number, productName, days, totalPrice);


        number++;
        productName = "laptop";
        days = 7;
        totalPrice = 10486.85;
        printStatistics(number, productName, days, totalPrice);
    }

    public static void printStatistics(int number, String productName, int days, double totalPrice) {
        double averagePrice = totalPrice / days;
        System.out.println("Product No " + number + ": " + productName + ",");
        System.out.println("total sales for " + days + " days is EUR " + totalPrice + ",");
        System.out.printf("sales by day is EUR %.2f", averagePrice);
        System.out.println();
    }
}
