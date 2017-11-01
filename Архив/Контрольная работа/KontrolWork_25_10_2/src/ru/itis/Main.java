package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a1 = 1, b1 = 1,
                ak = 3 * b1 + 2 * a1, bk = 2 * a1 + b1;
        double summ = 2.0 / (1 + a1 * a1 + b1 * b1), f = 2, q = 0;
        for (int k = 2; k <= n; k++) {
            f *= 2.0 / k;
            q = 1 + ak * ak + bk * bk;
            summ += f / q;
            a1 = ak;
            b1 = bk;
            ak = 3 * b1 + 2 * a1;
            bk = 2 * a1 + b1;
        }
        System.out.println("Summ = " + summ);
    }
}
