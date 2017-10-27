// Задание 12 Г

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = sc.nextDouble(), x = sc.nextDouble(), t = 1.0, summ = 0.0;
        int n = 0;
        while (Math.abs(t) > eps) {
            summ += t;
            n++;
            t *= -1.0 * x * x / (2.0 * n * (2.0 * n - 1.0));
        }
        System.out.println("cos(" + x + ") = " + summ);
    }
}
