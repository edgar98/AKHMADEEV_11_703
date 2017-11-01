package ru.itis;

import java.util.Scanner;

public class KvantorE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt();
        int [] a = new int[n];
        boolean f = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; (i < n) & (!f);i++) {
            if (a[i] == c) {
                f = !f;
            }
        }
        System.out.println("Есть ананас = " + f);
    }
}
