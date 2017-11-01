package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], w = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] != a[1]) {
            w[0] = 1;
        }
        for (int i = 1; i < n - 2; i++) {
            if (a[i] != a[i + 1] & a[i] != a[i - 1]) {
                w[i] = 1;
            }
        }
        if (a[n - 1] != a[n - 2]) {
            w[n - 1] = 1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(w));
    }
}
