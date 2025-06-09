package com.gmail.onishchenko.lectures.lecture05;

public class ForrestGump {
    public static void main(String[] args) {
        int danger = 100;
        int maxDanger = 42;
        int veryVeryDanger = 100;

        if (danger < maxDanger) {
            System.out.println("Ok)");
            System.out.println("You may walk)");
        } else if (danger < veryVeryDanger) {
            System.out.println("Run, Forrest, Run!!!");
        } else {
            System.out.println("RUUUUUUUUUUN!!!!!!!!!!!!");
        }

        boolean flag = true;
        if (flag == false) {
            System.out.println("Flag is enabled");
        }
    }
}
