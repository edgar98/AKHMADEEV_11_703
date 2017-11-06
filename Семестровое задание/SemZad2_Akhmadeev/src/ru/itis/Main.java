package ru.itis;

import java.util.Scanner;

public class Main {

    public static int kol_res = 3; // количество иксов и результатов
    public static double x[] = new double[kol_res], y, y_res[] = new double[kol_res], u, u0 = 1.0;
    public static int n;

    public static void main(String[] args) {
        init();
        for (int i = 0; i < 3; i++) {
            y = f(x[i]);
            for (int j = 1; j <= n; j++) {
                u = (2.0 / 3.0) * u0 + y / (3.0 * u0 * u0);
                u0 = u;
            }
            y_res[i] = u;

        }
        System.out.println("Результат вычисления y1 = " + y_res[0]);
        System.out.println("Результат вычисления y2 = " + y_res[1]);
        System.out.println("Результат вычисления y3 = " + y_res[2]);
    }

    public static double f(double x) {
        if (x < 0.5) return 1.0 - 0.1 * Math.cos(1 + x);
        else return 1.0 + 0.1 * Math.cos(1 +x);
    }

    public static void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x1: ");
        x[0] = sc.nextDouble();
        System.out.print("Введите x2: ");
        x[1] = sc.nextDouble();
        System.out.print("Введите x3: ");
        x[2] = sc.nextDouble();
        System.out.print("Введите n: ");
        n = sc.nextInt();
    }
}
