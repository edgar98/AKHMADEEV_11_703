package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = 0;
        double eps = sc.nextDouble(), s = 0, t = x;
        while (Math.abs(t) > eps) {
            s += t;
            n++;
            t *= (-1.0) * x * x / ((2 * n +1) * (2 * n));
        }
        System.out.println(n + " " + s);
    }
}
