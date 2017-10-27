// Задание 23 А

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), a = sc.nextDouble(), b = sc.nextDouble();
        double v0 = a, v = 2 * a, summ = 2 * Math.log(a * x);
        while (v >= a & v <= b) {
            summ += Math.log(v * x);
            double t = v;
            v += v0;
            v0 = t;
        }
        System.out.println("Summ = " + summ);
    }
}
