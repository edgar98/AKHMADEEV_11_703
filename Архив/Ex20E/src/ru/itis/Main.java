// Задание 20 Д

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int
                a = sc.nextInt(), e = sc.nextInt(),
                b = sc.nextInt(), f = sc.nextInt(),
                c = sc.nextInt(), g = sc.nextInt(),
                d = sc.nextInt(), h = sc.nextInt(),
                n = sc.nextInt();

        double
                x00 = a,
                x0 = b, y0 = b,
                x = c, y = c,
                x1 = d * x + e * y0 + f * x00,
                y1 = g * x + h * y0;

        for (int i = 4; i <= n; i++) {
            x00 = x0;
            x0 = x;
            y0 = y;
            x = x1;
            y = y1;
            x1 = d * x + e * y0 + f * x00;
            y1 = g * x + h * y0;
        }

        System.out.println("x(n) = " + x1);
        System.out.println("y(n) = " + y1);
    }
}
