package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y0 = x/3.0, eps = sc.nextDouble();
        if (x < 1) {
            y0 = x;
        }
        double y = y0 - (1.0/3.0) * (y0 - x / (y0 * y0));
        int k = 1;
        while (Math.abs(y0 - y) > eps) {
            y0 = y;
            y = y0 - (1.0/3.0) * (y0 - x / (y0 * y0));
            k++;
        }
        System.out.println("x^(1/3) = " + y);
    }
}
