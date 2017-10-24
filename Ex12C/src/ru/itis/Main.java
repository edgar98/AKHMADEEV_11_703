// Задание 12 В

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), eps = sc.nextDouble(), t = x, summ = 0;
        int n = 1;
        while (Math.abs(t) > eps) {
            summ += t;
            t *= -1 * x / (++n);
        }
        System.out.println("ln(1 + " + x + ") = " + summ);
    }
}
