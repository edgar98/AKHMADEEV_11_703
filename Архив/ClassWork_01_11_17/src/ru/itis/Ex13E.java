package ru.itis;

import java.util.Scanner;

public class Ex13E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] != a[1]) {
            t++;
        }
        for (int i = 1; i < n - 2; i++) {
            if (a[i] != a[i + 1] & a[i] != a[i - 1]) {
                t++;
            }
        }
        if (a[n - 1] != a[n - 2]) {
            t++;
        }
        System.out.println(t);
    }
}
