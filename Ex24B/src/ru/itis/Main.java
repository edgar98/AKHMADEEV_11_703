package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), eps = sc.nextDouble(), xn = 0,
                b0 = 1, c0 = 0, b1 = Math.cos(x), c1 = Math.sin(x),
                bk = b1 * b1 - c1 * c1, ck = c1 * b1 + c1 * b1, summ = b1;
        int m = sc.nextInt(), n = 2, p = -1;
        b0 = bk;
        c0 = ck;
        bk = b0 * b1 - c0 * c1;
        ck = c0 * b1 + c1 * b0;
        while (n <= m | Math.abs(xn) >= eps) {
            summ += p * (bk / n);
            b0 = bk;
            c0 = ck;
            bk = b0 * b1 - c0 * c1;
            ck = c0 * b1 + c1 * b0;
            b0 = bk;
            c0 = ck;
            bk = b0 * b1 - c0 * c1;
            ck = c0 * b1 + c1 * b0;
            p = -p;
            n++;
        }
        System.out.println("Summ = " + summ);
    }
}
