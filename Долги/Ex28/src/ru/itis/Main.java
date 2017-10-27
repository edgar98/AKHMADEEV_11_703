// Задание 28

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), eps = sc.nextDouble();
        double a = x, b = 1 - x;
        while (Math.abs(b) > eps) {
            a = a * (1.0 + b / 2.0);
            b = b * b * (3.0 + b);
        }
        System.out.println("An = " + a);
    }
}
