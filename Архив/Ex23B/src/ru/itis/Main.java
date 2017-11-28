// Задание 23 Б

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), a = sc.nextDouble(), b = sc.nextDouble();
        double v0 = a, v = 2.0 * a,
                summ = Math.cos(v0 * x) * Math.cos(v0 * x) * (v0 - v0 / 2.0);
        int k = 2, f = 1;
        while (v >= a & v <= b) {
            summ += f * (v / Math.pow(2.0, k)) * (Math.cos(v * x) * Math.cos(v * x));
            double t = v;   //корявенько...
            v += v0;
            v0 = t;
            f = -f;
        }
        System.out.println("Summ = " + summ);
    }
}
