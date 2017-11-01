package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), f = 1;
        int[] a = new int[n], v = new int[n], check = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                f++;
            } else {
                v[f - 1]++;
                f = 1;
            }
        }
        v[f - 1]++;
        for (int i = 0; i < n; i++) {
            check[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(check));
        System.out.println(Arrays.toString(v));

    }
}
