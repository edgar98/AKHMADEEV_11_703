// Задание 7

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = sc.nextDouble(), pi = 3.1415926;
        int k = 2;
        double rn = 4.0 / 3.0;
        while (Math.abs(rn - pi * 0.5) >= eps) {
            rn *= 4 * k * k / (4 * k * k - 1);
            k++;
        }
        System.out.println("Rn = " + rn);
        System.out.println("n = " + (k - 1));
    }
}
