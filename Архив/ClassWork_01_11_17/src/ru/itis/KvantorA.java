package ru.itis;

import java.util.Scanner;

public class KvantorA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt();
        int[] a = new int[n];
        boolean f = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; (i < n) & (f); i++) {
            if (a[i] != c) {
                f = !f;
            }
        }
        System.out.println("Все ананасы = " + f);
    }
}


