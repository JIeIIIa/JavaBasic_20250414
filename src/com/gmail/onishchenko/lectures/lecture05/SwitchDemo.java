package com.gmail.onishchenko.lectures.lecture05;

public class SwitchDemo {
    public static void main(String[] args) {
        int a = 1;

        System.out.println("-= IF =-");
        if (a == 1 || a == 0) {
            System.out.println("1 or 0");
        } else if (a == 2) {
            System.out.println("2");
        } else {
            System.out.println("Unknow value");
        }

        System.out.println("-= SWITCH =-");
        switch (a) {
            case 0:
            case 1: {
                System.out.println("1 or 0");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            default: {
                System.out.println("Unknow value");
                break;
            }
        }

        System.out.println("Good bye)");
    }
}
