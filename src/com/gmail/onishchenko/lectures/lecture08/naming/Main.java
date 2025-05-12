package com.gmail.onishchenko.lectures.lecture08.naming;

public class Main {
    public static void main(String[] args) {
        int a, d, s;

        int[] f = {1, 4, -3, 2, 5, 6, 7, 6, 5, 3, 5, 6, 7, 800, 6, 5, 4, 3, 7, 8, 7, 5};

        a = s = d = 0;

    a = f[0];                       d = f[0];
        for (int i = 0;i<21; i++) {
    if(a>f[i]) {
            a=f[i];
                                                                                                                                                                  }
                    if (d > f[i])
    {
            d = f[i];
        }

    s += f[i];

                        }


                                     s /= f.length;

        System.out.println("Max = " + a);System.out.println("Min = " + d);         System.out.println("Average = " + s);


}
 }
