// Задача 29 А

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x0 = 0, x = (x0 + 1) / (x0 + 2), eps = sc.nextDouble();
        int k;
        for (k = 1; Math.abs(x0 - x) > eps; k++) {
            x0 = x;
            x = (x0 + 1) / (x0 + 2);
        }
        System.out.println("n = " + k);
    }
}
